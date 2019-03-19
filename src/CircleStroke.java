import java.awt.*;

public class CircleStroke extends Circle {
    public CircleStroke(Painter p){
        super(Color.green,p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.setStroke(new BasicStroke(2));
        g.draw(getShape());
    }
}
