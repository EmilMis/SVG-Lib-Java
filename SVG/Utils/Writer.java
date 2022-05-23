package EmilMissoni.SVG.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public String filename;
    public File file;
    public FileWriter writer;

    public Writer(String filename) throws IOException {
        this.filename = filename;
        this.file = new File(filename);
        this.writer = new FileWriter(filename);
    }

    public void write(String content) throws IOException {
        this.writer.write(content);
    }

    public void close() throws IOException {
        this.writer.close();
    }

}
