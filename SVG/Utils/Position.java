package EmilMissoni.SVG.Utils;

import java.util.Random;

public class Position {

    public float x;
    public float y;

    public Random random = new Random();

    public Position(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Position(){
        ;
    }

    public Position randpos(int bound1, int bound2){return new Position(random.nextInt(bound1), random.nextInt(bound2));}

}
