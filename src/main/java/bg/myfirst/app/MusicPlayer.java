package bg.myfirst.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public String playMusic() {
        return "Playing Classical Music: " + classicalMusic.getSong() + " and Rock Music: " + rockMusic.getSong();
    }

}