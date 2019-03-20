package renderable;

import bounceable.Bounceable;

import java.awt.*;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public interface Renderable
{
    void display(Graphics2D g, Bounceable b);
}