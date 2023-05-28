package game1;

import javax.swing.*;

public class Window extends JFrame {
    private GameScene gameScene;
    private StartHomePage startHomePage;
    private StartHomePage2 startHomePage2;
    private JButton switchPanelsButton;
    private JButton startGame;

    public static final int WINDOW_WIDTH = 1900;
    public static final int WINDOW_HEIGHT = 1050;
    public static final int THE_MIDDLE_HEIGHT_OF_THE_WINDOW = WINDOW_HEIGHT / 2;
    public static final int THE_MIDDLE_WIDTH_OF_THE_WINDOW = WINDOW_WIDTH / 2;




    public Window () {

        this.setTitle("QUIDDITCH");
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.startHomePage2 = new StartHomePage2();
        this.startHomePage2.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.startHomePage2.setVisible(false);

        this.startHomePage = new StartHomePage();
        this.startHomePage.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);


        this.switchPanelsButton = new JButton(new ImageIcon("resources\\images\\StartButton2.2.4.3.jpg"));
        this.switchPanelsButton.setBounds(THE_MIDDLE_WIDTH_OF_THE_WINDOW  - (350 / 2) , THE_MIDDLE_HEIGHT_OF_THE_WINDOW + 150, 350,196);
        this.switchPanelsButton.setVisible(true);


        this.switchPanelsButton.addActionListener((e) -> {
            this.remove(startHomePage);
            this.startHomePage.setVisible(false);

            this.startHomePage2.setVisible(true);
            this.remove(switchPanelsButton);
            this.switchPanelsButton.setVisible(false);
            this.startGame.setVisible(true);

        });
        this.add(switchPanelsButton);
        this.add(startHomePage);

        this.startGame = new JButton(new ImageIcon("resources\\images\\HarryStartButton.2.2.gif"));
        this.startGame.setBounds(THE_MIDDLE_WIDTH_OF_THE_WINDOW - (217 / 2),WINDOW_HEIGHT - 250 , 217,149);
        this.startGame.setVisible(false);

        this.startGame.addActionListener((e) -> {
            this.remove(startHomePage2);

            this.gameScene = new GameScene();
                gameScene.setBounds(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
                this.add(gameScene);


                this.remove(startGame);
        });
        this.add(startGame);
        this.add(startHomePage2);
    }


    public void showWindow () {
        this.setVisible(true);
    }
}