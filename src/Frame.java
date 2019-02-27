import javax.swing.*;

public class Frame extends JFrame {
    private CirclePainter cpainter = new CirclePainter();
    private SquarePainter spainter = new SquarePainter();
    private int x, y;

    public Frame(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(cpainter);
        this.add(spainter);
        cpainter.setVisible(true);
        spainter.setVisible(true);
    }

    public void initList(Polygons[] circles, Polygons[] squares){
        cpainter.setList(circles);
        spainter.setList(squares);
    }

    public void draw() {
        cpainter.repaint();
        cpainter.checkBound(x, y);
        spainter.repaint();
        spainter.checkBound(x, y);
    }
}