package com.zipcodewilmington.froilansfarm.storage.field;

import com.zipcodewilmington.froilansfarm.crop.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    List<Crop> crops = new ArrayList<Crop>();

    public void addCrop(Crop crop){
        crops.add(crop);
    }
}
