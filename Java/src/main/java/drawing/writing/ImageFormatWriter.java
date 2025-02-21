package drawing.writing;

import drawing.shapes.Line;
import java.io.IOException;
import java.io.Writer;

public interface ImageFormatWriter {
    void write(Line[] lines, Writer writer) throws IOException;
}