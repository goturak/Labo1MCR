import javax.swing.*;
import java.awt.*;
/**
 * Created by guillaume on 25/02/19.
 */
public class Painter extends JPanel{
    private Polygons[] ps;

    public void setList(Polygons[] ps){
        this.ps = ps;
    }

    public Polygons[] getPs(){
        return ps;
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
    }

    public void checkBound(int x, int y){
        for(Polygons poly : ps){
            if(poly.getX() < 0){
                poly.setX(0);
                poly.getV().invertX();
            }
            if(poly.getX() > x - poly.getRadius()*2){
                poly.setX(x - poly.getRadius()*2);
                poly.getV().invertX();
            }
            if(poly.getY() < 0){
                poly.setY(0);
                poly.getV().invertY();
            }
            if(poly.getY() > y - poly.getRadius()*2){
                poly.setY(y - poly.getRadius()*2);
                poly.getV().invertY();
            }
        }
    }
}
