package game1;

import javax.swing.*;
import java.awt.*;


public class StartHomePage extends JPanel {

    public static final int START_HOME_PAGE1_X = 0;
    public static final int START_HOME_PAGE1_Y = 0;

    public StartHomePage() {

    }

    public void paintComponent (Graphics graphics) {
        super.paintComponent(graphics);

        ImageIcon startHomePageImage = Utils.loadFile("resources\\images\\StartBackground1.2.2.6.jpg");
        startHomePageImage.paintIcon(null, graphics, START_HOME_PAGE1_X, START_HOME_PAGE1_Y);
    }
}