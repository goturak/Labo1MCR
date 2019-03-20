package displayer;

import bounceable.Bounceable;
import bounceable.CircleStroke;
import bounceable.SquareStroke;

import java.util.Random;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class StrokeShapeFactory extends AbstractShapeFactory {

    @Override
    Bounceable createCircle() {
        Frame f = Frame.getInstance();
        Random r = new Random();
        return new CircleStroke(r.nextInt(f.getWidth()), r.nextInt(f.getHeight()),20 + r.nextInt(41),f.getRenderer());
    }

    @Override
    Bounceable createSquare() {
        Frame f = Frame.getInstance();
        Random r = new Random();
        return new SquareStroke(r.nextInt(f.getWidth()), r.nextInt(f.getHeight()), 20 + r.nextInt(41),f.getRenderer());
    }
}
