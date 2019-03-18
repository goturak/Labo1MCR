import java.awt.*;
import java.awt.geom.Ellipse2D;


/**
 * Created by guillaume on 28/02/19.
 */
public class Circle extends Polygons{
    Circle(int x, int y, Painter p){
        super(x, y, new Ellipse2D.Float(), Color.MAGENTA, p);
    }

    public void draw() {
            Frame.getInstance().getGraphics().setColor(this.getColor());
            Frame.getInstance().getGraphics().fillOval((int) this.getX(), (int) this.getY(), (int) this.getRadius() * 2, (int) this.getRadius() * 2);
            this.move();
    }
}
