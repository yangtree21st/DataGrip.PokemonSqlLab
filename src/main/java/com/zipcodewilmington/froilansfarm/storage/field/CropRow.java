package com.zipcodewilmington.froilansfarm.storage.field;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Edible;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CropRow {
    List<Crop> crops = new ArrayList<Crop>();

    public void addCrop(Crop crop){
        crops.add(crop);
    }
    public <T extends Crop> void addCropRow(Supplier<T> cropSupplier, int numberOfCrops){
        for (int i = 0; i < numberOfCrops; i++) {
            addCrop(cropSupplier.get());
        }
    }
}
