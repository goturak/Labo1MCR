import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by guillaume on 28/02/19.
 */
public class Square extends Polygons {

    Square(int x, int y){
        super(x,y, new Rectangle(10,10, 40, 40), Color.CYAN);
    }

    public void draw() {
        move();
        Graphics2D g = Frame.getInstance().getGraphics();
        g.setColor(getColor());
        g.fill(getShape());

      //  g.fillRect((int)getX(), (int)getY(),40,40);

    }
    public void move(){
        super.move();
        Rectangle r = (Rectangle) getShape();
        r.setLocation((int)getX(), (int)getY());
    }
}
