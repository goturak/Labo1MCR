package bounceable;

import renderable.Renderer;

import java.awt.*;
import java.awt.geom.Ellipse2D;


/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public abstract class Circle extends Polygons {
    Circle(Color c, int x, int y, int size, Renderer p) {
        super(new Ellipse2D.Double(), c, x, y, size, p);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(getColor());
    }
    public void move(){
        super.move();
        Ellipse2D.Double e = (Ellipse2D.Double) getShape();
        e.setFrame(getX(), getY(), getRadius()*2, getRadius()*2);
    }
}
