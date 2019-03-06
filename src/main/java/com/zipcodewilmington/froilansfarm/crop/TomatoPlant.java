package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;

import java.util.function.Supplier;

public class TomatoPlant extends Crop<Tomato> {
    public TomatoPlant() {
        super(Tomato::new);
    }

}
