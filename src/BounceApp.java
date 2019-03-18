import java.util.LinkedList;
import java.util.Random;

public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    // Autres attributs
    public BounceApp() {

        Random r = new Random();
        Painter p = new Painter(500, 500);
        LinkedList<Bouncable> shapes = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(2) == 1) {
                shapes.add(new Square(500, 500, p));
            } else {
                shapes.add(new Circle(500, 500, p));
            }
        }
        this.bouncers = shapes;
        p.setList(bouncers);
        Frame.getInstance().setPainter(p);
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