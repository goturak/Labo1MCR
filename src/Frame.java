import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class Frame extends JFrame implements Displayer {
    private static Frame instance;
    private Painter cpainter;
    private int x, y;

    private Frame(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addKeyListener(KeyAdapter ka){

    }

    public static Frame getInstance() {
        if (instance == null) {
            instance = new Frame(500,500);
        }
        return instance;
    }

    public void repaint() {
        cpainter.repaint();

    }
    public void setPainter(Painter p){
        cpainter = p;
        this.add(cpainter);
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