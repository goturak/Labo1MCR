package displayer;

import bounceable.Bounceable;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public abstract class AbstractShapeFactory {
    abstract Bounceable createCircle();
    abstract Bounceable createSquare();
}
