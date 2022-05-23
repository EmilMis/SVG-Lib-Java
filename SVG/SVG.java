package EmilMissoni.SVG;

import EmilMissoni.SVG.Utils.Position;
import EmilMissoni.SVG.Utils.RGB;
import EmilMissoni.SVG.Utils.Writer;
import EmilMissoni.SVG.Utils.LineGenerator;
import java.io.IOException;

public class SVG {
    public Writer writer;
    public LineGenerator lineGenerator = new LineGenerator();
    public SVG(String filename, int height, int width) throws IOException {
        this.writer = new Writer(filename);
        this.writer.write(String.format("<svg height=\"%d\" width=\"%d\">", height, width));
    }

    public void Line(Position startPos, Position endPos, RGB rgb_1, RGB rgb_2, float starTime, float endTime, float thickness) throws IOException {
        writer.write(lineGenerator.GenerateLine(startPos, endPos, rgb_1, rgb_2, starTime, endTime, thickness));
    }

    public void close() throws IOException {
        this.writer.write("</svg>");
        this.writer.close();
    }

}
