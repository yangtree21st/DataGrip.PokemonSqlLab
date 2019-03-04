package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    List<Chicken> chickens = new ArrayList<Chicken>();
    public void add(Chicken chicken){
        chickens.add(chicken);
    }
}
