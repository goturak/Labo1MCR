import java.awt.*;
/**
 * Created by guillaume on 20/02/19.
 */
public class CirclePainter extends Painter {

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Polygons circle : this.getPs()) {
            graphics.fillOval((int) circle.getX(), (int) circle.getY(), (int) circle.getRadius() * 2, (int) circle.getRadius() * 2);
            circle.move();
        }
    }

}