package bounceable;

import java.util.Random;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 * @ClassDescription This class represent a movement vector, with the x and y coordinate and a speed.
 */
public class Vector {
    private double x;
    private double y;

    /**
     * Random constructor of a Vector.
     */
    public Vector(){
        Random r = new Random();
        this.x = r.nextDouble();
        this.y = r.nextDouble();
        double speed = 1 + r.nextInt(4);
        boolean xNegative = (r.nextInt(2) == 0);
        boolean yNegative = (r.nextInt(2) == 0);
        double norm = Math.sqrt(x*x + y*y);
        this.x /= norm;
        this.y /= norm;
        if(xNegative) this.x = -x;
        if(yNegative) this.y = -y;
        this.x *= speed;
        this.y *= speed;
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
