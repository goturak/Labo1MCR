import java.util.Random;

/**
 * Created by guillaume on 20/02/19.
 */
public class Polygons {
    private double x;
    private double y;
    private Vector v;
    private double radius = 20;

    Polygons(int x, int y){
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
}
