package bounceable;

import renderable.Renderer;

import java.awt.*;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class SquareStroke extends Square {
    public SquareStroke(int x, int y, int size, Renderer p){
        super(Color.yellow, x, y, size, p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.setStroke(new BasicStroke(2));
        g.draw(getShape());
    }
}
