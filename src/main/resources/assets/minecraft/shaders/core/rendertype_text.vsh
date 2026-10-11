#version 330

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:globals.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;


uniform sampler2D Sampler2;







out float sphericalVertexDistance;
out float cylindricalVertexDistance;
out vec4 vertexColor;
out vec2 texCoord0;

struct Text {
	vec4 color;
    bool isShadow;
	float id;
	vec4 glPos;
};
Text text;

#moj_import <utils.glsl>
#moj_import <effect/text_shaders.glsl>
#moj_import <effect/font_shaders.glsl>

void main() {

	vec4 pos = vec4(Position, 1.0);

	text.color = Color;
    sphericalVertexDistance = fog_spherical_distance(Position);
    cylindricalVertexDistance = fog_cylindrical_distance(Position);
    vertexColor = text.color * texelFetch(Sampler2, UV2 / 16, 0);
    texCoord0 = UV0;

	text.id = floor((pos.y + 1000.0) / 5000.0);
	pos.y = mod(pos.y + 1000.0, 5000.0) - 1000.0;
	gl_Position = ProjMat * ModelViewMat * pos;

	text.glPos = gl_Position;
	if (ProjMat[3][3] == 0.0) {
		text.glPos *= 0.25;
	}

	#moj_import <config/font_shaders_config.glsl>
	#moj_import <config/text_shaders_config.glsl>

	gl_Position = text.glPos;
	vertexColor = text.color;
	
	// NoShadow behavior (https://github.com/PuckiSilver/NoShadow)
    ivec3 iColor = ivec3(Color.xyz * 255 + vec3(0.5));
    if (iColor == ivec3(78, 92, 36) && (
        Position.z == 2200.03 || // Actionbar
        Position.z == 2400.06 || // Subtitle
        Position.z == 2400.12 || // Title
        Position.z == 50.03 ||   // Opened Chat
        Position.z == 2650.03 || // Closed Chat
        Position.z == 200.03 ||  // Advancement Screen
        Position.z == 400.03 ||  // Items
        Position.z == 1000.03 || // Bossbar
        Position.z == 2800.03 || // Scoreboard List
        Position.z == 2000       // Scoreboard Sidebar (Has no shadow, remove tint for consistency)
        )) { // Regular text
        vertexColor.rgb = texelFetch(Sampler2, UV2 / 16, 0).rgb; // Remove color from no shadow marker
    } else if (iColor == ivec3(19, 23, 9) && (
        Position.z == 2200 || // Actionbar
        Position.z == 2400 || // Subtitle | Title
        Position.z == 50 ||   // Opened Chat
        Position.z == 2650 || // Closed Chat
        Position.z == 200 ||  // Advancement Screen
        Position.z == 400 ||  // Items
        Position.z == 1000 || // Bossbar
        Position.z == 2800    // Scoreboard List
        )) { // Shadow
        gl_Position = vec4(2,2,2,1); // Move shadow off screen
    }
	
}