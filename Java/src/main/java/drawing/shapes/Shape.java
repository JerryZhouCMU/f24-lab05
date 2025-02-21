package drawing.shapes;

import drawing.writing.ImageFormatWriter;

import java.io.IOException;
import java.io.Writer;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public interface Shape {
    /**
     * Draws lines to file.
     */
    void draw(Writer writer, ImageFormatWriter formatWriter) throws IOException;
}
