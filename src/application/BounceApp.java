package application;

import bounceable.Bounceable;
import displayer.Frame;

import java.util.LinkedList;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class BounceApp {
    private LinkedList<Bounceable> bouncers;

    // Autres attributs
    public BounceApp() {

        this.bouncers = new LinkedList<>();
        Frame.getInstance().getRenderer().setList(bouncers);

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