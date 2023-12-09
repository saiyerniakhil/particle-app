import java.awt.*;
import java.util.Random;
class Particle extends Thread{
    protected int x;
    protected int y;
    protected int n;

    protected Canvas canvas;

    protected Color particleColor;



    protected final Random rng = new Random();

    public Particle(Canvas canvas, int initialX, int initialY, int n, Color color) {
        x = initialX;
        y = initialY;
        particleColor = color;
        this.canvas = canvas;
        this.n = n;
    }

    public void setParticleColor(Color color) {
        StdDraw.setPenColor(color);
    }



    public void run() {

        while (Math.abs(x) < n && Math.abs(y) < n) {
            setParticleColor(particleColor);
//            StdDraw.filledCircle(x, y, 0.5);
            double r = Math.random();
            //move to a random point
            if (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;
            //if there's a collision, then generate some other ser of points
            if(canvas.checkCollision(x, y, particleColor)) {
                if (r < 0.25) x--;
                else if (r < 0.50) x++;
                else if (r < 0.75) y--;
                else if (r < 1.00) y++;
                StdDraw.filledSquare(x, y, 0.5);
                StdDraw.show();
                StdDraw.pause(500);
            }

//            StdDraw.setPenColor(StdDraw.RED);

        }
    }


    @Override
    public String toString() {
        return "Particle{" +
                "x=" + x +
                ", y=" + y +
                ", rng=" + rng +
                '}';
    }
}