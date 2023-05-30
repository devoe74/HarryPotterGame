package game1;

import java.awt.*;

public class Utils {
    public static final String ADD_TO_PATH = "HarryPotterGame-master\\";
    public static void sleep (int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkCollision (Rectangle rect1, Rectangle rect2) {
        return rect1.intersects(rect2);
    }

    public static int seconds(double millis){
        return (int) millis * 1000;
    }
}
