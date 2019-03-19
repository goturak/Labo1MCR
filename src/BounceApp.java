import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;



public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    // Autres attributs
    public BounceApp() {

        Random r = new Random();
        LinkedList<Bouncable> shapes = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(4) == 0) {
                shapes.add(new SquareFilled(Frame.getInstance().getPainter()));
            }
            if (r.nextInt(4) == 1) {
                shapes.add(new CircleFilled(Frame.getInstance().getPainter()));
            }
            if (r.nextInt(4) == 2) {
                shapes.add(new CircleStroke(Frame.getInstance().getPainter()));
            }
            if (r.nextInt(4) == 3) {
                shapes.add(new SquareStroke(Frame.getInstance().getPainter()));
            }
        }
        this.bouncers = shapes;
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