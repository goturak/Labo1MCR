package displayer;

import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * @Author Guillaume Vetter & Luca Reis de Carvalho
 */
public interface Displayer
{
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
    void addKeyListener(KeyAdapter ka);
}