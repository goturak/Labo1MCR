import java.awt.*;

/**
 * Created by guillaume on 28/02/19.
 */
public class Square extends Polygons {
    Square(int x, int y, Painter p){
        super(x,y, new Rectangle(), Color.CYAN, p);
    }

    public void draw() {
        Frame.getInstance().getGraphics().setColor(this.getColor());
        Frame.getInstance().getGraphics().fillRect((int) this.getX(), (int) this.getY(), (int) this.getRadius() * 2, (int) this.getRadius() * 2);
        this.move();
    }
}
