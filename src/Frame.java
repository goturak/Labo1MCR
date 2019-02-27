import javax.swing.*;

public class Frame extends JFrame {
    private Painter cpainter = new Painter();
    private int x, y;

    public Frame(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(cpainter);
        cpainter.setVisible(true);
    }

    public void initList(Polygons[] circles, Polygons[] squares){
        cpainter.setList(circles, squares);
    }

    public void draw() {
        cpainter.repaint();
        cpainter.checkBound(x, y);
    }
}