package bg.myfirst.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {


    @Autowired
    @Qualifier("classicalMusic")
    private Music music;

    @Autowired
    @Qualifier("rockMusic")
    private Music music1;


    public String playMusic() {
        return "Playing: " + music.getSong() + music1.getSong();
    }

}