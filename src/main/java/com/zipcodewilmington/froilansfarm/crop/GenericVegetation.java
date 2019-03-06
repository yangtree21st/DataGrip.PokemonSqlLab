package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edible.Edible;

import java.util.function.Supplier;

public class GenericVegetation extends Crop<Edible> {
    public GenericVegetation() {
        super(Edible::new);
    }
}
