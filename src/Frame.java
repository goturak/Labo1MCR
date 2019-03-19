import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class Frame extends JFrame implements Displayer {
    private static Frame instance;
    private Painter painter;
    private int x, y;

    private Frame(int x, int y, Painter p) {
        setSize(x, y);
        this.painter = p;
        this.x = x;
        this.y = y;
        add(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addKeyListener(KeyAdapter ka){

    }

    public static Frame getInstance() {
        if (instance == null) {
            instance = new Frame(500,500, new Painter());
        }
        return instance;
    }

    public void repaint() {
        painter.repaint();
    }

    public Painter getPainter(){ return painter; }

    public int getWidth(){
        return super.getWidth();
    }
    public int getHeight(){
        return super.getHeight();
    }

    public Graphics2D getGraphics(){
        return (Graphics2D) super.getGraphics();
    }

    public void setTitle(String s){
        instance.setTitle(s);
    }
}