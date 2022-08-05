package com.example;

import java.util.List;

public class Alex extends Lion {
    boolean hasMane;
    Lion lion;

    public Alex(Lion lion) {
        super(lion.feline);
    }

    public Alex() throws Exception {
        super("Самец");
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
