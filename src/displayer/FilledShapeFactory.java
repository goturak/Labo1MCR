package displayer;

import bounceable.Bounceable;
import bounceable.CircleFilled;
import bounceable.SquareFilled;

import java.util.Random;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class FilledShapeFactory extends  AbstractShapeFactory {

    @Override
    Bounceable createCircle() {
        Frame f = Frame.getInstance();
        Random r = new Random();
        return new CircleFilled(r.nextInt(f.getWidth()), r.nextInt(f.getHeight()), 20 + r.nextInt(41),f.getRenderer());
    }

    @Override
    Bounceable createSquare() {
        Frame f = Frame.getInstance();
        Random r = new Random();
        return new SquareFilled(r.nextInt(f.getWidth()), r.nextInt(f.getHeight()), 20 + r.nextInt(41),f.getRenderer());
    }
}
