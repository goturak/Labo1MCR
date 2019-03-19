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

    Polygons(int x, int y, Shape s, Color c){
        Random r = new Random();
        this.x = r.nextDouble() * x;
        this.y = r.nextDouble() * y;
        this.v = new Vector();
        this.s = s;
        this.c = c;
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
        checkBound(Frame.getInstance().getWidth(),Frame.getInstance().getHeight());
    }

    public Renderable getRenderer(){
        return null;
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
