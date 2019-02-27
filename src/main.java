/**
 * Created by guillaume on 20/02/19.
 */
public class main {
    public static void main(String[] args){
        Frame frame = new Frame(500,500);

        Polygons[] circles = new Polygons[40];
        for(int i = 0; i < 40; i++){
           circles[i] = new Polygons(500,500);
        }

        Polygons[] squares = new Polygons[40];
        for(int i = 0; i < 40; i++){
            squares[i] = new Polygons(500,500);
        }

        frame.initList(circles, squares);

        while(true){
            try {
                Thread.sleep(7);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            frame.draw();
        }
    }
}
