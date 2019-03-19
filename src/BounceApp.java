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
        Painter p = new Painter();
        LinkedList<Bouncable> shapes = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(2) == 1) {
                shapes.add(new Square(500, 500));
            } else {
                shapes.add(new Circle(500, 500));
            }
        }
        this.bouncers = shapes;
        p.setList(bouncers);
        Frame.getInstance().setPainter(p);
    }

    public void loop() {



        ActionListener task = new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               Frame.getInstance().repaint();
            }
        };
        new Timer(17,task);
        /*while (true) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Frame.getInstance().repaint();
        }*/
    }

    public static void main(String... args) {
        BounceApp b = new BounceApp();
        b.loop();


    }

}