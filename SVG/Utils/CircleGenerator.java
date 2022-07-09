package SVG.Utils;

public class CircleGenerator {
    public CircleGenerator(){
    }

    /*public String generate(Position pos, float radius, float thickness, RGB color_start, RGB color_end, float start_time, float end_time){
        return String.format("""
                        <circle cx="%d" cy="%d" r="%f" stroke-width="%f" stroke="rgb(%d, %d, %d)">
                            <animate attributeName="stroke" from="rgb(%d, %d, %d)" to="rgb(%d, %d, %d)" begin="%fs" dur="%fs"/>
                            <animate attributeName="stroke-width" from="0.5" to="%f" begin="%fs" dur="%fs"/>
                        </circle>""".indent(4), pos.x, pos.y, radius, thickness, color_end.red, color_end.green, color_end.blue, color_start.red, color_start.green, color_start.blue, color_end.red, color_end.green, color_end.blue, start_time, end_time - start_time, thickness, start_time, end_time - start_time);
    }
*/
    public String generate(Position startPos, float radius, float thickness, RGB rgb_1, RGB rgb_2, RGB fill1, RGB fill2, float startTime, float endTime){
        return String.format("""
                        <circle cx="%f" cy="%f" r="%f" stroke-width="%f" stroke="rgb(%d, %d, %d)" fill="rgb(%d, %d, %d)">
                            <animate attributeName="stroke" from="rgb(%d, %d, %d)" to="rgb(%d, %d, %d)" begin="%fs" dur="%fs"/>
                            <animate attributeName="stroke-width" from="0.5" to="%f" begin="%fs" dur="%fs"/>
                            <animate attributeName="r" from="0" to="%f" begin="%fs" dur="%fs"/>
                            <animate attributeName="fill" from="rgb(%d, %d, %d)" to="rgb(%d, %d, %d)" begin="%fs" dur="%fs"/>
                        </circle>""".indent(6), startPos.x, startPos.y, radius, thickness, rgb_2.red, rgb_2.green, rgb_2.blue, fill2.red, fill2.green, fill2.blue, rgb_1.red, rgb_1.green, rgb_1.blue, rgb_2.red, rgb_2.green, rgb_2.blue, startTime, endTime - startTime, thickness, startTime, endTime - startTime, radius, startTime, endTime - startTime, fill1.red, fill1.green, fill1.blue, fill2.red, fill2.green, fill2.blue, startTime, endTime - startTime);
    }

}
