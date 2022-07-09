import SVG.Utils.*;

import java.io.IOException;
import java.util.Random;

public class SVG {
    public int height;
    public int width;

    public Writer writer;
    public LineGenerator lineGenerator = new LineGenerator();
    public Random random = new Random();
    public Position pos = new Position();
    public RGB rgb = new RGB();
    public CircleGenerator circleGenerator = new CircleGenerator();

    public SVG(String filename, int height, int width) throws IOException {
        this.height = height;
        this.width = width;
        this.writer = new Writer(filename);
        this.writer.write(String.format("<svg height=\"%d\" width=\"%d\">", height, width));
    }

    public void Line(Position startPos, Position endPos, RGB rgb_1, RGB rgb_2, float starTime, float endTime, float thickness) throws IOException {
        writer.write(lineGenerator.GenerateLine(startPos, endPos, rgb_1, rgb_2, starTime, endTime, thickness));
    }

    public void Circle(Position startPos, float radius, float thickness, RGB color_start, RGB color_end, RGB fill1, RGB fill2, float start_time, float end_time) throws IOException {
        writer.write(circleGenerator.generate(startPos, radius, thickness, color_start, color_end, fill1, fill2, start_time, end_time));
    }

    public void random_Line() throws IOException {

        this.Line(  pos.randpos(width, height), pos.randpos(width, height),
                    rgb.rand_color(), rgb.rand_color(),
                    0, 1, random.nextFloat()*3);
    }

    public void random_Line(Position basepos) throws IOException {

        this.Line(  basepos, pos.randpos(width, height),
                rgb.rand_color(), rgb.rand_color(),
                0, 1, random.nextFloat()*3);
    }

    public void random_Circle() throws IOException {
        float rad = random.nextFloat(70) + 20;
        this.Circle(pos.randpos(width, height), rad, random.nextFloat(1), new RGB(255, 255, 255), new RGB(0, 0, 0), rgb.rand_color(), rgb.rand_color(), 0, random.nextFloat(3) + 1);
    }

    public void close() throws IOException {
        this.writer.write("</svg>");
        this.writer.close();
    }

}
