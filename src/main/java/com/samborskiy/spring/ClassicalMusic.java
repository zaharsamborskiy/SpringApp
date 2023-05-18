package com.samborskiy.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("init");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
