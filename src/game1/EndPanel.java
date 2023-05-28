package game1;

import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel {

    public void paintComponent(Graphics graphics){
        ImageIcon endHomePageImage = new ImageIcon("C:\\Users\\daniel\\IdeaProjects\\HarryPotterGame\\resources\\images\\EndBackground.1.2.jpg");
        endHomePageImage.paintIcon(null, graphics, 0,0);


    }
}
