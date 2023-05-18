package com.samborskiy.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wild cries Mary";
    }
}
