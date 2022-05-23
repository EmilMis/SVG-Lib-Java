package EmilMissoni.SVG.Utils;

public class RGB {

    public int red;
    public int green;
    public int blue;

    public RGB(int red, int green, int blue){
        this.red = Math.min(red, 255);
        this.green = Math.min(green, 255);
        this.blue = Math.min(blue, 255);
    }

    public RGB transact(RGB rgb_1, RGB rgb_2, float k){

        int r = Math.min(rgb_1.red, rgb_2.red);
        int g = Math.min(rgb_1.green, rgb_2.green);
        int b = Math.min(rgb_1.blue, rgb_2.blue);

        int diff_r = Math.abs(rgb_1.red - rgb_2.red);
        int diff_g = Math.abs(rgb_1.green - rgb_2.green);
        int diff_b = Math.abs(rgb_1.blue - rgb_2.blue);

        r += diff_r * k;
        g += diff_g * k;
        b += diff_b * k;

        return new RGB(r, g, b);

    }

}