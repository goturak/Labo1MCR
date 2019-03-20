package renderable;

import bounceable.Bounceable;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public class Renderer extends JPanel implements Renderable {
    private LinkedList<Bounceable> shapes;
    public void setList(LinkedList<Bounceable> shapes) {
        this.shapes = shapes;
    }
    public void add(Bounceable newShapes){
        shapes.add(newShapes);
    }
    public void addList(LinkedList<Bounceable> newShapes){
        shapes.addAll(newShapes);
    }
    public void clear(){
        shapes.clear();
    }
    public Renderer(){
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        for (Bounceable shape : shapes) {
            display((Graphics2D)graphics, shape);
        }
    }

    public void display(Graphics2D g, Bounceable b){
        b.draw(g);
    }
}
