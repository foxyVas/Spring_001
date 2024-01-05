package bg.myfirst.app;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private String name;
    private int volume;

    // IoC - Inversion of Control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer() {}

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    // Spring makes setMusic to music
    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }
}
