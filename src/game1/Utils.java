package game1;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Utils {
    public static void sleep (int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static ImageIcon loadFile(String str){
        ImageIcon imageIcon = null;
        try {
            imageIcon = new ImageIcon(ImageIO.read(new File(str)));

        }catch (Exception e){
            System.out.println("Error\n"+e);
        }
        return imageIcon;

    }

    public static boolean checkCollision (Rectangle rect1, Rectangle rect2) {
        return rect1.intersects(rect2);
    }

    public static int seconds(double millis){
        return (int) millis * 1000;
    }
}
