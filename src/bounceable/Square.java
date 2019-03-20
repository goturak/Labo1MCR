package bounceable;

import renderable.Renderer;

import java.awt.*;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public abstract class Square extends Polygons {


    Square(Color c, int x, int y, int size, Renderer p){
        super(new Rectangle(0,0, size,size),c , x, y, size, p);
    }

    public void draw(Graphics2D g) {

        move();
        g.setColor(getColor());
    }
    public void move(){
        super.move();
        Rectangle r = (Rectangle) getShape();
        r.setSize((int)getRadius(), (int)getRadius());
        r.setLocation((int)getX(), (int)getY());
    }
}
