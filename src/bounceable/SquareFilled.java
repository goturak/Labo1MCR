package bounceable;

import renderable.Renderer;

import java.awt.*;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class SquareFilled extends Square {
    public SquareFilled(int x, int y, int size, Renderer p){
        super(Color.LIGHT_GRAY, x, y, size, p);
    }
    public void draw(Graphics2D g) {
        super.draw(g);
        g.fill(getShape());
    }
}
