import java.awt.*;
import java.awt.geom.Ellipse2D;


/**
 * Created by guillaume on 28/02/19.
 */
public class Circle extends Polygons {
    Circle(Painter p) {
        super(new Ellipse2D.Double(), Color.orange, p);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(getColor());
        g.fill(getShape());
    }
    public void move(){
        super.move();
        Ellipse2D.Double e = (Ellipse2D.Double) getShape();
        e.setFrame(getX(), getY(), getRadius()*2, getRadius()*2);
    }
}
