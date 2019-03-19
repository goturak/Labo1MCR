import java.awt.*;

/**
 * Created by guillaume on 28/02/19.
 */
public class Square extends Polygons {

    Square(Color c, Painter p){
        super(new Rectangle(0,0,40,40), c, p);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(getColor());
    }
    public void move(){
        super.move();
        Rectangle r = (Rectangle) getShape();
        r.setLocation((int)getX(), (int)getY());
    }
}
