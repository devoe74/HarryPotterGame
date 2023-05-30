package game1;

import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel {

    public void paintComponent(Graphics graphics){
        ImageIcon endHomePageImage = new ImageIcon(Utils.ADD_TO_PATH + "resources\\images\\EndBackground.2.7.jpg.png");
        endHomePageImage.paintIcon(null, graphics, 0,0);


    }
}
