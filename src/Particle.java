import java.awt.*;
import java.util.Random;
class Particle {
    protected int x;
    protected int y;
    protected int n;

    protected Color particleColor;



    protected final Random rng = new Random();

    public Particle(int initialX, int initialY, int n, Color color) {
        x = initialX;
        y = initialY;
        particleColor = color;
        this.n = n;
    }

    public void setParticleColor(Color color) {
        StdDraw.setPenColor(color);
    }



    public void start() {

        while (Math.abs(x) < n && Math.abs(y) < n) {
            setParticleColor(particleColor);
            StdDraw.filledCircle(x, y, 0.5);
            double r = Math.random();
            if (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;
//            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(x, y, 0.5);
            StdDraw.show();
            StdDraw.pause(5);
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