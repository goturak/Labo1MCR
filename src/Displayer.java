import java.awt.*;

/**
 * Created by guillaume on 28/02/19.
 */
public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
}
