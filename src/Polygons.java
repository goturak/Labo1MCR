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

    Polygons(int x, int y, Shape s, Color c){
        Random r = new Random();
        this.x = r.nextDouble() * x;
        this.y = r.nextDouble() * y;
        this.v = new Vector();
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

}
