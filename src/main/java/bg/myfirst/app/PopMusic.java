package bg.myfirst.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>(3);
        songs.add("1 Pop");
        songs.add("2 Pop");
        songs.add("3 Pop");
        return songs;
    }
}