package drawing.writing;

import java.io.IOException;

public class ImageFormatWriterFactory {
    public static ImageFormatWriter createWriter(String format, String filename) throws IOException {
        return switch (format.toLowerCase()) {
            case "jpeg" -> new JPEGWriter(filename + ".jpeg");
            case "png" -> new PNGWriter(filename + ".png");
            default -> throw new IllegalArgumentException("Unsupported format: " + format);
        };
    }
}