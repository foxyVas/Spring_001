package bg.myfirst.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    Random random = new Random();

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = random.nextInt(3);
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        if (id == 1) {
            return "Computer " + id + " " +  musicPlayer.playMusic(MusicGenre.ROCK);
        } else if (id == 2) {
            return "Computer " + id + " " +  musicPlayer.playMusic(MusicGenre.POP);
        } else return "Computer " + id + " " +  musicPlayer.playMusic(MusicGenre.CLASSICAL);

    }
}