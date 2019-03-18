import java.util.Random;
/**
 * Created by guillaume on 20/02/19.
 */
public class main {
    public static void main(String[] args){
        Random r = new Random();

        Polygons[] shapes = new Polygons[20];
        for(int i = 0; i < 20; i++){
            if(r.nextInt(2) == 1){
                shapes[i] = new Square(500,500);
            } else {
                shapes[i] = new Circle(500,500);
            }
        }

        Frame.getInstance().initList(shapes);

        while(true){
            try {
                Thread.sleep(7);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            Frame.getInstance().repaint();
        }
    }
}
