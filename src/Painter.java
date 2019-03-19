import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Created by guillaume on 25/02/19.
 */
public class Painter extends JPanel implements Renderable {
    private LinkedList<Bouncable> shapes;
    public void setList(LinkedList<Bouncable> shapes) {
        this.shapes = shapes;
    }

    public Painter(){
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Bouncable shape : shapes) {
            display((Graphics2D)graphics, shape);
        }
    }

    public void display(Graphics2D g, Bouncable b){
        b.draw(g);
    }
}
