import java.awt.*;

public class SquareStroke extends Square {
    public SquareStroke(Painter p){
        super(Color.red,p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.setStroke(new BasicStroke(2));
        g.draw(getShape());
    }
}
