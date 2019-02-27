import java.util.Random;

/**
 * Created by guillaume on 25/02/19.
 */
public class Vector {
    private double x;
    private double y;

    public Vector(){
        Random r = new Random();
        this.x = r.nextDouble();
        this.y = r.nextDouble();
        boolean xNegative = (r.nextInt(2) == 0);
        boolean yNegative = (r.nextInt(2) == 0);
        double norm = Math.sqrt(x*x + y*y);
        this.x /= norm;
        this.y /= norm;
        if(xNegative) this.x = -x;
        if(yNegative) this.y = -y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public void invertX(){
        this.x = -x;
    }
    public void invertY(){
        this.y = -y;
    }
}
