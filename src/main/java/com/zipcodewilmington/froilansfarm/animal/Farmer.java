package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.storage.field.CropRow;
import com.zipcodewilmington.froilansfarm.animal.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.animal.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.animal.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.storage.Farm;

public class Farmer extends Person implements Rider, Botanist {

    private Farm farm;
    public void eat(Edible food) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void plant(Crop crop, CropRow cropRow) {

    }
    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
