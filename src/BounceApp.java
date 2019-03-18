import java.util.LinkedList;
import java.util.Random;

public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    // Autres attributs
    public BounceApp() {
        /* ... */
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

        Random r = new Random();

        Polygons[] shapes = new Polygons[20];
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(2) == 1) {
                shapes[i] = new Square(500, 500);
            } else {
                shapes[i] = new Circle(500, 500);
            }
        }

        Frame.getInstance().initList(shapes);




    }
}