#version 330

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:globals.glsl>

uniform sampler2D Sampler0;






in float sphericalVertexDistance;
in float cylindricalVertexDistance;
in vec4 vertexColor;
in vec2 texCoord0;
in vec2 texCoord1;

out vec4 fragColor;

void main() {
    vec4 texture_color = texture(Sampler0, texCoord0);
    vec4 color = vec4(0.0, 0.0, 0.0, 0.0);
    
    if (texture_color.a < 0.00392156862745098) {
        discard;
    } else if (texture_color.a == 0.996078431372549) {
        color = texture_color * ColorModulator;
    } else {
        color = texture_color * vertexColor * ColorModulator;
    }

    fragColor = apply_fog(color, sphericalVertexDistance, cylindricalVertexDistance, FogEnvironmentalStart, FogEnvironmentalEnd, FogRenderDistanceStart, FogRenderDistanceEnd, FogColor);
}