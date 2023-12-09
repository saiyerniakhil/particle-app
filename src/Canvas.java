import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Canvas {
    private final int boundary; //n
//    private final Set<ColorPoint> visitedPoints = new HashSet<ColorPoint>();
    private final Set<Point> visitedPoints = new HashSet<Point>();

    public Canvas(int boundary) {
        this.boundary = boundary;
        StdDraw.setScale(-boundary, boundary);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
    }
    public boolean checkCollision(int x, int y, Color particleColor) {
        //TODO: check collisions with the boundaries
//        ColorPoint tempPoint = new ColorPoint(particleColor, new Point(x, y));
        Point tempPoint = new Point(x, y);
        synchronized (visitedPoints) {
            boolean conts = visitedPoints.contains(tempPoint);
            System.out.println("contains: " + tempPoint.toString() + "in" + conts);
            if(visitedPoints.contains(tempPoint)) {
                System.out.println("Visited Points: ");
                System.out.println(visitedPoints.toString());
                System.out.println("Current Point: ");
                System.out.println(tempPoint.toString());
                return true;
            } else {
                System.out.println("Current Visited Point: ");
                System.out.println(tempPoint.toString());
                visitedPoints.add(tempPoint);
                return false;
            }
        }
    }

}
