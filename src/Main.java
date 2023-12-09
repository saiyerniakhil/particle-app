import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //boundary
        int n = 10;
        // init canvas
        Canvas canvas = new Canvas(n);

        Color[] colors = {Color.BLACK, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.ORANGE,
        Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.PINK, new Color(168, 166, 79)};


        //creating 10 particle
        Particle[] particles = new Particle[2];
        for(int j=0; j < particles.length; j++) {
            particles[j] = new Particle(canvas, j,j+2, n, colors[j]);
        }

        //moving 10 particles
        for (var particle:particles) {
            System.out.println(particle.toString());
            particle.start();
        }



    }
}