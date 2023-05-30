package game1;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Audio {
    private boolean playMusic;


    public Audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.playMusic = true;
        File backgroundAudioFile = new File(Main.ADD_TO_PATH + "resources\\Audio\\QuidditchAudio2.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(backgroundAudioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        clip.start();

        new Thread(() ->{
            while (true){
                if (playMusic){
                    clip.start();
                }else {
                    clip.stop();
                }
            }
        }).start();

    }

    public void PlayMusic(){
        this.playMusic = true;
    }
    public void stopMusic(){
        this.playMusic = false;
    }

}