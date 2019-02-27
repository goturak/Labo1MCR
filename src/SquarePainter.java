import java.awt.*;
/**
 * Created by guillaume on 20/02/19.
 */
public class SquarePainter extends Painter {

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Polygons square : this.getPs()) {
            graphics.fillRect((int) square.getX(), (int) square.getY(), (int) square.getRadius(), (int) square.getRadius());
            square.move();
        }
    }

}