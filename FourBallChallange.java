import processing.core.PApplet;

public class FourBallChallange extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;

    private FourBallChallangeTest ball1 = new FourBallChallangeTest(1,1*HEIGHT/5);
    private FourBallChallangeTest ball2 = new FourBallChallangeTest(2,2*HEIGHT/5);
    private FourBallChallangeTest ball3 = new FourBallChallangeTest(3,3*HEIGHT/5);
    private FourBallChallangeTest ball4 = new FourBallChallangeTest(4,4*HEIGHT/5);

    public static void main(String[] args) {
        PApplet.main("OOPSChallengeMain",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        this.ball1.moveBall(this);
        this.ball2.moveBall(this);
        this.ball3.moveBall(this);
        this.ball4.moveBall(this);
    }
}
