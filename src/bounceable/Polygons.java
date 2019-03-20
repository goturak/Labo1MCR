package bounceable;

import displayer.Frame;
import renderable.Renderable;
import renderable.Renderer;

import java.awt.*;
import java.util.Random;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public abstract class Polygons implements Bounceable {
    private Renderer renderer;
    private double x;
    private double y;
    private Vector v;
    private Shape s;
    private Color c;
    private double radius;

    Polygons(Shape s, Color c, int x, int y, int size, Renderer p){
        renderer = p;
        Random r = new Random();
        this.x = x;
        this.y = y;
        this.v = new Vector();
        this.s = s;
        this.c = c;
        this.radius = size;
    }

    public double getRadius(){ return radius;}

    public Vector getV() {
        return v;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void move(){
        double x = getX() + getV().getX();
        double y = getY() + getV().getY();
        setY(y);
        setX(x);
        checkBound(Frame.getInstance().getWidth(), Frame.getInstance().getHeight());
    }

    public Renderable getRenderer(){
        return renderer;
    }

    public Color getColor(){
        return this.c;
    }

    public Shape getShape(){
        return this.s;
    }

    public void checkBound(double x, double y) {
            if (this.getX() < 0) {
                this.setX(0.0);
                this.getV().invertX();
            }
            if (this.getX() > x - this.getRadius() * 2) {
                this.setX(x - this.getRadius() * 2);
                this.getV().invertX();
            }
            if (this.getY() < 0) {
                this.setY(0.0);
                this.getV().invertY();
            }
            if (this.getY() > y - this.getRadius() * 2) {
                this.setY(y - this.getRadius() * 2);
                this.getV().invertY();
            }
    }

}
