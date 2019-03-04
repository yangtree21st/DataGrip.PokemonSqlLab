package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stable {
    List<Horse> horses = new ArrayList<Horse>();

    public void add(Horse horse) {
        horses.add(horse);
    }

    public Collection< Horse> getHorses() {
        return horses;
    }
}
