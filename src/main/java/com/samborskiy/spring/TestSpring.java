package com.samborskiy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        context.close();
    }
}
