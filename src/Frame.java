import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame implements Displayer {
    private static Frame instance;
    private Painter cpainter;
    private int x, y;

    private Frame(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        cpainter = new Painter(x, y);
        this.add(cpainter);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
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

    public void repaint() {
        cpainter.checkBound(this.getWidth(),this.getHeight());
        cpainter.repaint();

    }
    public int getWidth(){
        return super.getWidth();
    }
    public int getHeight(){
        return super.getHeight();
    }
    public Graphics2D getGraphics(){
        return (Graphics2D)super.getGraphics();
    }

    public void setTitle(String s){
        instance.setTitle(s);
    }
}