package drawing.shapes;

import java.io.IOException;
import java.io.Writer;

import drawing.writing.ImageFormatWriter;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Triangle implements Shape {
    private final Line[] lines;

    public Triangle(int[] point1, int[] point2, int[] point3) {
        this.lines = new Line[]{
                new Line(point1, point2),
                new Line(point2, point3),
                new Line(point3, point1)
        };
    }

    @Override
    public void draw(Writer writer, ImageFormatWriter formatWriter) throws IOException {
        formatWriter.write(lines, writer);
    }
}
