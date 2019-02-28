import java.awt.*;

/**
 * Created by guillaume on 28/02/19.
 */
public class Square extends Polygons {
    Square(int x, int y){
        super(x,y);
    }

    public void paintComponent(final Graphics graphics) {
        graphics.setColor(Color.cyan);
        graphics.fillRect((int) this.getX(), (int) this.getY(), (int) this.getRadius() * 2, (int) this.getRadius() * 2);
        this.move();
    }
}
