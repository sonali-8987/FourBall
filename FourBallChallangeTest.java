
import processing.core.PApplet;

public class FourBallChallangeTest extends PApplet {
    private int ballSpeed ;
    private int diameter;
    private int gapFromTop;
    private int position;

    public FourBallChallangeTest(int ballSpeed, int gapFromTop) {
        this.ballSpeed = ballSpeed;
        this.gapFromTop = gapFromTop;
        this.diameter = 10;
        this.position = 0;
    }

    void moveBall(PApplet pApplet){
        pApplet.ellipse(this.position,this.gapFromTop,this.diameter,this.diameter);
        this.position += this.ballSpeed;
    }

}
