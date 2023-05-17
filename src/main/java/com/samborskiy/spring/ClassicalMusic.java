package com.samborskiy.spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit() {
        System.out.println("Initialization " + ClassicalMusic.class.getName());
    }
    public void doMyDestroy() {
        System.out.println("Destruction " + ClassicalMusic.class.getName());
    }
}
