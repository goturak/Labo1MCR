import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import static java.awt.event.KeyEvent.*;


public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    // Autres attributs
    public BounceApp() {

        this.bouncers = new LinkedList<>();
        Frame.getInstance().getPainter().setList(bouncers);

    }

    public void loop() {
        while (true) {
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Frame.getInstance().repaint();
        }
    }

    public static void main(String... args) {
        BounceApp b = new BounceApp();
        b.loop();
    }

}