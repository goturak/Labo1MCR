import java.awt.*;

public class CircleFilled extends Circle {
    public CircleFilled(Painter p){
        super(Color.orange,p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.fill(getShape());
    }
}
