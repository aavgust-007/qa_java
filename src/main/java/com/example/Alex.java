package com.example;

import java.util.List;

public class Alex extends Lion {


    public Alex() throws Exception {
        super("Самец", feline);

    }

    public List<String> getFriends() {
        return List.of("Марти", "Глории", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    @Override
    public boolean doesHaveMane() {
        return super.doesHaveMane();
    }

}
