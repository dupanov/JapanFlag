/**
 * Created by Вадик on 04.11.2015.
 */
//import javafx.scene.canvas.Canvas;

import java.awt.*;
import javax.swing.JFrame;



public class JapanFlag extends Canvas {

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame("Japan flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new JapanFlag();
        int width = 600;
        int height = 400;
        canvas.setSize(width, height);
        canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);


    }


    public void paint (Graphics g){
        Rectangle bb = new Rectangle(0,0,600,400);
        g.setColor(Color.white);
        g.fillRect(0,0, 600, 400);
        g.setColor(Color.RED);
        g.fillOval(195, 100, 200, 200);
    }






}











