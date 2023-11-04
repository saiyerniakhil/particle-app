import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //boundary
        int n = 30;
        // canvas related settings
        StdDraw.setScale(-n, n);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);

        Color[] colors = {Color.BLACK, Color.RED, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.ORANGE,
        Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.PINK};


        //creating 10 particle
        Particle[] particles = new Particle[10];
        for(int j=0; j < 10; j++) {
            particles[j] = new Particle(j,j+2, n, colors[j]);
//            particles[j].setParticleColor(colors[j]);
        }

        //moving 10 particles
        for (var particle:particles) {
            System.out.println(particle.toString());
            particle.start();
        }



    }
}