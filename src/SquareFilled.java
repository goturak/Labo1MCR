import java.awt.*;

public class SquareFilled extends Square {
    public SquareFilled(Painter p){
        super(Color.blue,p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.fill(getShape());
    }
}
