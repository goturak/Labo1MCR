import java.awt.*;

public class StrokeShapeFactory extends AbstractShapeFactory {
    @Override
    Bouncable createCircle() {
        return new CircleStroke(Frame.getInstance().getPainter());
    }

    @Override
    Bouncable createSquare() {
        return new SquareStroke(Frame.getInstance().getPainter());
    }
}
