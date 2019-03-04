package com.zipcodewilmington.froilansfarm.storage.field;

import java.util.ArrayList;
import java.util.List;

public class Field {
    List<CropRow> cropRows = new ArrayList<CropRow>();
    public void addCropRow(CropRow row){
        cropRows.add(row);
    }
    public List<CropRow> getCropRows(){
        return cropRows;
    }
}
