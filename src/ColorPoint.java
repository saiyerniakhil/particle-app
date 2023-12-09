import java.awt.*;

public class ColorPoint {
    private Color color;
    private Point point;

    public ColorPoint(Color color, Point point) {
        this.color = color;
        this.point = point;
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "color=" + color +
                ", point=" + point +
                '}';
    }
}
