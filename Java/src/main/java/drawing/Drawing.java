package drawing;

import drawing.shapes.Shape;
import drawing.writing.ImageFormatWriter;
import drawing.writing.ImageFormatWriterFactory;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Drawing {

    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Draw shapes to a file with given file format.
     *
     * @param format   file format
     * @param filename file name
     */
    public void draw(String format, String filename) {
        // TODO: Do you notice any issues here?
        try (Writer writer = new java.io.FileWriter(filename + "." + format)) {
            ImageFormatWriter formatWriter = ImageFormatWriterFactory.createWriter(format, filename);
            for (Shape shape : this.shapes) {
                // TODO: What is the issue of the behavior here?
                shape.draw(writer, formatWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

