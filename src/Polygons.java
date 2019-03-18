import java.awt.*;
import java.util.Random;

/**
 * Created by guillaume on 20/02/19.
 */
public abstract class Polygons implements Bouncable{
    private double x;
    private double y;
    private Vector v;
    private Shape s;
    private Color c;
    private double radius = 20;
    private Painter painter;

    Polygons(int x, int y, Shape s, Color c, Painter p){
        Random r = new Random();
        this.x = r.nextDouble() * x;
        this.y = r.nextDouble() * y;
        this.v = new Vector();
        this.s = s;
        this.c = c;
        this.painter = p;
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
        this.x += v.getX();
        this.y += v.getY();
        checkBound(x,y);
    }
    public Renderable getRenderer(){
        return this.painter;
    }
    public Color getColor(){
        return this.c;
    }
    public Shape getShape(){
        return this.s;
    }

    public void checkBound(double x, double y) {
            if (this.getX() < 0) {
                this.setX(0);
                this.getV().invertX();
            }
            if (this.getX() > x - this.getRadius() * 2) {
                this.setX(x - this.getRadius() * 2);
                this.getV().invertX();
            }
            if (this.getY() < 0) {
                this.setY(0);
                this.getV().invertY();
            }
            if (this.getY() > y - this.getRadius() * 2) {
                this.setY(y - this.getRadius() * 2);
                this.getV().invertY();
            }
    }

}
