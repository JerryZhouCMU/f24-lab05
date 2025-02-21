package drawing.shapes;

import drawing.writing.ImageFormatWriter;
import java.io.IOException;
import java.io.Writer;

public class Rectangle implements Shape {
    private final Line[] lines;

    public Rectangle(int[] p1, int[] p2, int[] p3, int[] p4) {
        this.lines = new Line[]{
                new Line(p1, p2), new Line(p2, p3), new Line(p3, p4), new Line(p4, p1)
        };
    }

    @Override
    public void draw(Writer writer, ImageFormatWriter formatWriter) throws IOException {
        formatWriter.write(lines, writer);
    }
}
