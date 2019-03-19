public class FilledShapeFactory extends  AbstractShapeFactory {



    @Override
    Bouncable createCircle() {
        return new CircleFilled(Frame.getInstance().getPainter());
    }

    @Override
    Bouncable createSquare() {
        return
                new SquareFilled(Frame.getInstance().getPainter());
    }
}
