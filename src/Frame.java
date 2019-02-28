import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame implements Displayer {
    private static Frame instance;
    private Graphics2D graphics;
    private Painter cpainter = new Painter();
    private int x, y;

    private Frame(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(cpainter);
        cpainter.setVisible(true);
    }

    public static Frame getInstance() {
        if (instance == null) {
            instance = new Frame(500,500);
        }
        return instance;
    }

    public void initList(Polygons[] shapes){
        cpainter.setList(shapes);
    }

    public void draw() {
        cpainter.repaint();
        cpainter.checkBound(this.getWidth(),this.getHeight());
    }
    public int getWidth(){
        return instance.getWidth();
    }
    public int getHeight(){
        return instance.getHeight();
    }
    public Graphics2D getGraphics(){
        return graphics;
    }
    public void repaint(){
        cpainter.repaint();
        cpainter.checkBound(instance.getWidth(), instance.getHeight());
    }
    public void setTitle(String s){
        instance.setTitle(s);
    }
}