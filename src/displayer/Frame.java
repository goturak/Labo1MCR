package displayer;

import renderable.Renderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class Frame extends JFrame implements Displayer, KeyListener {
    private static Frame instance;
    private Renderer Renderer;
    private int x, y;
    private FilledShapeFactory ffs;
    private StrokeShapeFactory sfs;

    private Frame(int x, int y, Renderer p) {
        setSize(x, y);
        this.Renderer = p;
        this.x = x;
        this.y = y;
        ffs = new FilledShapeFactory();
        sfs = new StrokeShapeFactory();
        add(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);

    }


    public static Frame getInstance() {
        if (instance == null) {
            instance = new Frame(500, 500, new Renderer());
        }
        return instance;
    }

    public void repaint() {
        Renderer.repaint();
    }

    public Renderer getRenderer() {
        return Renderer;
    }

    public int getWidth() {
        return super.getWidth();
    }

    public int getHeight() {
        return super.getHeight();
    }

    public Graphics2D getGraphics() {
        return (Graphics2D) super.getGraphics();
    }

    public void setTitle(String s) {
        instance.setTitle(s);
    }

    public void addKeyListener(KeyAdapter ka) {
        addKeyListener(ka);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * @param e Event of the method.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case VK_B:
                for (int i = 0; i < 10; i++) {
                    getRenderer().add(ffs.createSquare());
                    getRenderer().add(ffs.createCircle());
                }
                break;
            case VK_F:
                for (int i = 0; i < 10; i++) {
                    getRenderer().add(sfs.createSquare());
                    getRenderer().add(sfs.createCircle());
                }
                break;
            case VK_E:
                getRenderer().clear();
                break;
            case VK_Q:
                this.dispose();
                System.exit(0);
                break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}