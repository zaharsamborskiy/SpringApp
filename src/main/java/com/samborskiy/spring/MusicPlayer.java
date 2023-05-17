package com.samborskiy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic music1,
                       RockMusic music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (musicGenre == MusicGenre.ClASSIC) {
            System.out.println(classicalMusic.getSong().get(randomNum));
        } else {
            System.out.println(rockMusic.getSong().get(randomNum));
        }
    }
}
