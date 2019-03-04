package com.zipcodewilmington.froilansfarm.animal.interfaces;


import com.zipcodewilmington.froilansfarm.storage.field.CropRow;
import com.zipcodewilmington.froilansfarm.crop.Crop;

public interface Botanist {
    public void plant(Crop crop, CropRow cropRow);
}
