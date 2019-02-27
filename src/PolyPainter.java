import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by guillaume on 20/02/19.
 */
public class PolyPainter extends JPanel{

    private List<Polygons> ps;

    public List<Polygons> getPs(){
        return ps;
    }

    public void setList(final List<Polygons> ps) {
        this.ps = ps;
    }
}
