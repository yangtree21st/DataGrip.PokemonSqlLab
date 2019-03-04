package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;

public class TomatoPlant extends Crop {
    public Edible yield() {
        return new Tomato();
    }
}
