package com.roboshoes.fizzy.gl;

public class Shader {

    private Shader() {}

    private static final String NL = "\n";

    public static final String vertex =
            "attribute vec4 vPosition;" + NL +
            "attribute vec2 vTexCoord;" + NL +
            "uniform mat4 mvp;" + NL +
            "uniform mat4 xform;" + NL +
            "void main() {" + NL +
            "   gl_PointSize = 3.0;" + NL +
            "   gl_Position = mvp * xform * vPosition;" + NL +
            "}";

    public static final String fragment =
            "precision mediump float;" + NL +
            "uniform vec3 color;" + NL +
            "void main() {" + NL +
            "    gl_FragColor = vec4( color, 1.0 );" + NL +
            "}";
}
