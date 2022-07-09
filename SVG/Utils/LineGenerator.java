import SVG.Utils.Position;
import SVG.Utils.RGB;

public class LineGenerator {

    public String GenerateLine(Position startPos, Position endPos, RGB rgb_1, RGB rgb_2, float startTime, float endTime, float thickness){
        return String.format("""
                        <line x1="%f" y1="%f" x2="%f" y2="%f" stroke-width="%f" stroke="rgb(%d, %d, %d)">
                            <animate attributeName="stroke" from="rgb(%d, %d, %d)" to="rgb(%d, %d, %d)" begin="%fs" dur="%fs"/>
                            <animate attributeName="stroke-width" from="0.5" to="%f" begin="%fs" dur="%fs"/>
                        </line>""".indent(4), startPos.x, startPos.y, endPos.x, endPos.y, thickness, rgb_2.red, rgb_2.green, rgb_2.blue, rgb_1.red, rgb_1.green, rgb_1.blue, rgb_2.red, rgb_2.green, rgb_2.blue, startTime, endTime - startTime, thickness, startTime, endTime - startTime);
    }

}
