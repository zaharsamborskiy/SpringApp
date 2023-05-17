package com.samborskiy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music firstMusicPlayer = context.getBean("rapMusic", Music.class);
        Music secondMusicPlayer = context.getBean("rockMusic", Music.class);
        Music thirdMusicPlayer = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(firstMusicPlayer);
        MusicPlayer musicPlayer1 = new MusicPlayer(secondMusicPlayer);
        MusicPlayer musicPlayer2 = new MusicPlayer(thirdMusicPlayer);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();


        context.close();
    }
}
