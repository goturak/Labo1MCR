import javax.swing.*;
import java.awt.*;
/**
 * Created by guillaume on 25/02/19.
 */
public class Painter extends JPanel {
    private Polygons[] circles;
    private Polygons[] squares;

    public void setList(Polygons[] circles, Polygons[] squares) {
        this.circles = circles;
        this.squares = squares;
    }


    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Polygons circle : circles) {
            graphics.setColor(Color.yellow);
            graphics.fillOval((int) circle.getX(), (int) circle.getY(), (int) circle.getRadius() * 2, (int) circle.getRadius() * 2);
            circle.move();
        }
        for (Polygons square : squares) {
            graphics.setColor(Color.cyan);
            graphics.fillRect((int) square.getX(), (int) square.getY(), (int) square.getRadius() * 2, (int) square.getRadius() * 2);
            square.move();
        }
    }

    public void checkBound(int x, int y) {
        bound(x, y, circles);
        bound(x, y, squares);
    }

    public void bound(int x, int y, Polygons[] ps) {
        for (Polygons poly : ps) {
            if (poly.getX() < 0) {
                poly.setX(0);
                poly.getV().invertX();
            }
            if (poly.getX() > x - poly.getRadius() * 2) {
                poly.setX(x - poly.getRadius() * 2);
                poly.getV().invertX();
            }
            if (poly.getY() < 0) {
                poly.setY(0);
                poly.getV().invertY();
            }
            if (poly.getY() > y - poly.getRadius() * 2) {
                poly.setY(y - poly.getRadius() * 2);
                poly.getV().invertY();
            }
        }
    }
}
