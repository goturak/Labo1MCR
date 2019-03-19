import java.awt.*;

/**
 * Created by guillaume on 28/02/19.
 */
public class Square extends Polygons {

    Square(Painter p){
        super(new Rectangle(10,10, 40, 40), Color.blue, p);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(getColor());
        g.fill(getShape());
    }
    public void move(){
        super.move();
        Rectangle r = (Rectangle) getShape();
        r.setLocation((int)getX(), (int)getY());
    }
}
