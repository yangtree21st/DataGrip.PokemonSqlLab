package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class CornStalk extends Crop {
    public Edible yield() {
        return new EarCorn();
    }
}
