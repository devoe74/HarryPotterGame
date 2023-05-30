package game1;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
public class Main {
    public static final String ADD_TO_PATH = "HarryPotterGame-master\\";
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Window window = new Window();
        window.showWindow();
    }
}