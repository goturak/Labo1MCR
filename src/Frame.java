import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_Q;

public class Frame extends JFrame implements  Displayer,KeyListener{
    private static Frame instance;
    private Painter painter;
    private int x, y;
    private FilledShapeFactory ffs;
    private  StrokeShapeFactory sfs;

    private Frame(int x, int y, Painter p) {
        setSize(x, y);
        this.painter = p;
        this.x = x;
        this.y = y;
        ffs= new FilledShapeFactory();
        sfs= new StrokeShapeFactory();
        add(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);

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

    @Override
    public void addKeyListener(KeyAdapter ka) {
        addKeyListener(ka);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_B) {
            for (int i = 0; i < 10; i++) {
                getPainter().add(ffs.createSquare());
                getPainter().add(ffs.createCircle());
            }
        }else if (e.getKeyCode() == KeyEvent.VK_F) {
            for (int i = 0; i < 10; i++) {
                getPainter().add(sfs.createSquare());
                getPainter().add(sfs.createCircle());
            }
        }else if (e.getKeyCode() == KeyEvent.VK_E) {
           getPainter().clear();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}