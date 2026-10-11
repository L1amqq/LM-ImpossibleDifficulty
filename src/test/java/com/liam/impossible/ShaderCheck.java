package com.liam.impossible;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL33;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.zip.ZipFile;

/** Compiles and links the actual ported shaders in an invisible OpenGL context. */
public final class ShaderCheck {
    private static Path custom;
    private static ZipFile vanilla;
    public static void main(String[] args) throws Exception {
        custom=Path.of(args[0]);vanilla=new ZipFile(args[1]);
        if(!GLFW.glfwInit())throw new IllegalStateException("GLFW initialization failed");
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE,GLFW.GLFW_FALSE);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR,3);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR,3);
        long window=GLFW.glfwCreateWindow(64,64,"Shader validation",0,0);
        if(window==0)throw new IllegalStateException("OpenGL 3.3 context unavailable");
        GLFW.glfwMakeContextCurrent(window);GL.createCapabilities();
        try {
            for(String name:List.of("rendertype_text","rendertype_text_see_through","rendertype_item_entity_translucent_cull")){
                int vertex=compile("core/"+name+".vsh",GL33.GL_VERTEX_SHADER);
                int fragment=compile("core/"+name+".fsh",GL33.GL_FRAGMENT_SHADER);
                int program=GL33.glCreateProgram();GL33.glAttachShader(program,vertex);GL33.glAttachShader(program,fragment);GL33.glLinkProgram(program);
                if(GL33.glGetProgrami(program,GL33.GL_LINK_STATUS)==0)throw new IllegalStateException(name+": "+GL33.glGetProgramInfoLog(program));
                System.out.println("SHADER_PASS "+name);GL33.glDeleteProgram(program);GL33.glDeleteShader(vertex);GL33.glDeleteShader(fragment);
            }
        } finally {GLFW.glfwDestroyWindow(window);GLFW.glfwTerminate();vanilla.close();}
    }
    private static int compile(String path,int type) throws Exception {
        String source=expand(path,new HashSet<>(),true);int shader=GL33.glCreateShader(type);GL33.glShaderSource(shader,source);GL33.glCompileShader(shader);
        if(GL33.glGetShaderi(shader,GL33.GL_COMPILE_STATUS)==0)throw new IllegalStateException(path+": "+GL33.glGetShaderInfoLog(shader));return shader;
    }
    private static String expand(String path,Set<String> seen,boolean root) throws Exception {
        if(!seen.add(path))return "";String source;
        Path file=custom.resolve(path);
        if(Files.exists(file))source=Files.readString(file);
        else {var entry=vanilla.getEntry("assets/minecraft/shaders/"+path);if(entry==null)throw new IllegalArgumentException("Missing shader include "+path);try(var in=vanilla.getInputStream(entry)){source=new String(in.readAllBytes(),java.nio.charset.StandardCharsets.UTF_8);}}
        if(!root)source=source.replaceAll("(?m)^\\s*#version[^\\r\\n]*","");
        Matcher m=Pattern.compile("#moj_import\\s+<([^>]+)>").matcher(source);StringBuilder result=new StringBuilder();
        while(m.find()){String include=m.group(1).replace("minecraft:","");m.appendReplacement(result,Matcher.quoteReplacement(expand("include/"+include,seen,false)));}return m.appendTail(result).toString();
    }
}
