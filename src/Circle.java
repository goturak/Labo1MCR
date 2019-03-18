import java.awt.*;


/**
 * Created by guillaume on 28/02/19.
 */
public class Circle extends Polygons{
    Circle(int x, int y){
        super(x, y, new Ellipse(), Color.MAGENTA);
    }

    public void draw() {
            graphics.setColor(this.getColor());
            graphics.fillOval((int) this.getX(), (int) this.getY(), (int) this.getRadius() * 2, (int) this.getRadius() * 2);
            this.move();
    }
}
