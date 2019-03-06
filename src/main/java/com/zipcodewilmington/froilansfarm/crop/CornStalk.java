package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.edible.EarCorn;
import com.zipcodewilmington.froilansfarm.edible.Edible;

import java.util.function.Supplier;

public class CornStalk extends Crop<EarCorn> {
    public CornStalk() {
        super(EarCorn::new);
    }

}
