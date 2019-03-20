package bounceable;

import renderable.Renderable;

import java.awt.*;
/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public interface Bounceable
{
    void draw(Graphics2D g);
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}