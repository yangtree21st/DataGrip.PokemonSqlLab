package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.animal.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class Crop  implements Produce {
    public Edible yield() {
        return new Edible();
    }
}
