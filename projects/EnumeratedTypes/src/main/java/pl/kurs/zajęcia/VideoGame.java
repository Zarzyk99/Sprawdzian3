package pl.kurs.zajęcia;

import pl.kurs.zajęcia.GameCategory;
import pl.kurs.zajęcia.GamePlatform;

import java.util.Arrays;

public class VideoGame {
    private String title;
    private GameCategory gameCategory;
    private GamePlatform[] gamePlatforms;

    public VideoGame(String title, GameCategory gameCategory, GamePlatform... gamePlatforms) {
        this.title = title;
        this.gameCategory = gameCategory;
        this.gamePlatforms = gamePlatforms;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", gameCategory=" + gameCategory +
                ", gamePlatforms=" + Arrays.toString(gamePlatforms) +
                '}';
    }
}
