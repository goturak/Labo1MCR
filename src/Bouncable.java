import java.awt.*;

public interface Bouncable
{
    void draw(Graphics2D g);
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}