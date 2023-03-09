import java.util.Locale;

public class Polygon {
    private Point[] vertices;
    public Polygon(int numberOfVertices) {
        this.vertices = new Point[numberOfVertices];
    }
    public void setVertex(int vertexNumber, Point newVertex) {
        vertices[vertexNumber] = newVertex;
    }
    public void SetVertices(Point[] newArrayOfVertices) {
        this.vertices = newArrayOfVertices;
    }
    public String toSvg() {
        String s = "";
        for(Point p : vertices) {
            //format wynika z tego, że w svg liczby są wprowadzane w taki sposób.
            //https://www.w3schools.com/graphics/svg_polygon.asp
            s+=p.x+","+p.y+" ";
        }
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\" style=\"/>", s);
    }
}
