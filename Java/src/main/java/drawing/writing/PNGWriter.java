package drawing.writing;

import drawing.shapes.Line;
import java.io.IOException;
import java.io.Writer;

public class PNGWriter implements ImageFormatWriter {
    private final Writer writer;

    public PNGWriter(String filename) throws IOException {
        this.writer = new java.io.FileWriter(filename);
    }

    @Override
    public void write(Line[] lines, Writer writer) throws IOException {
        for (Line line : lines) {
            writer.write(line.toPNG());
        }
    }
}
