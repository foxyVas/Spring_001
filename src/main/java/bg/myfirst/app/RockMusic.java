package bg.myfirst.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicBeanRock")
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList <>(3);
        songs.add("1 Rock");
        songs.add("2 Rock");
        songs.add("3 Rock");
        return songs;
    }
}