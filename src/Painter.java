import javax.swing.*;
import java.awt.*;
/**
 * Created by guillaume on 25/02/19.
 */
public class Painter extends JPanel {
    private Polygons[] shapes;
    private int width, height;

    public void setList(Polygons[] shapes) {
        this.shapes = shapes;
    }

    public Painter(int w, int h){
        this.width = w;
        this.height = h;
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Polygons shape : shapes) {
            shape.paintComponent(graphics);
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width,height);
    }

    public void checkBound(int x, int y) {
        for (Polygons poly : shapes) {
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
