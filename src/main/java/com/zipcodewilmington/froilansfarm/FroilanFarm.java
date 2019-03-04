package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Farm;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.field.CropRow;
import com.zipcodewilmington.froilansfarm.storage.field.Field;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class FroilanFarm {

    private Farm farm;
    private Farmer froilan;
    private Farmer froilanda;

    public Farm getFarm() {
        return farm;
    }

    //Construct the farm
    public FroilanFarm() {

        Farm farm = new Farm();
        addFieldToFarm(farm);
        addChickenCoopToFarm(farm);
        addStablesToFarm(farm);
        addVehiclesToFarm(farm);
        addFarmHouseToFarm(farm);

    }

    private void addVehiclesToFarm(Farm farm) {
        farm.addVehicles(new CropDuster());
        farm.addVehicles(new Tractor());
        farm.addVehicles(new Tractor());
    }

    private void addFarmHouseToFarm(Farm farm) {
        froilan = new Farmer();
        froilanda = new Farmer();
        froilan.setFarm(farm);
        froilanda.setFarm(farm);
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
        farm.setFarmHouse(farmHouse);

    }

    private void addFieldToFarm(Farm farm) {
        Field field = new Field();

        CropRow cornRow = addToCropRow(new CornStalk(), 5);
        CropRow tomatoRow = addToCropRow(new TomatoPlant(), 5);
        CropRow genericCropRow = addToCropRow(new Crop(), 5);

        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
        field.addCropRow(genericCropRow);
        field.addCropRow(genericCropRow);
        field.addCropRow(genericCropRow);

    }

    public CropRow addToCropRow(Crop crop, int numberOfCrops) {
        CropRow cropRow = new CropRow();
        for (int i = 0; i < numberOfCrops; i++) {
            cropRow.addCrop(crop);
        }
        return cropRow;
    }

    private void addChickenCoopToFarm(Farm farm) {
        for (int i = 0; i < 4; i++) {

            ChickenCoop chickenCoop = new ChickenCoop();
            for (int j = 0; j < 4; j++) {
                if (i == 3 && j != 3)
                    chickenCoop.add(new Chicken());
            }
            farm.addChickenCoop(chickenCoop);
        }
    }

    private void addStablesToFarm(Farm farm) {
        for (int i = 0; i < 3; i++) {

            Stable stable = new Stable();
            for (int j = 0; j < 3; j++) {
                stable.add(new Horse());
            }
            if (i == 2)
                stable.add(new Horse());
            farm.addStable(stable);
        }
    }

    public Farmer getFroilan() {
        return froilan;
    }
    public Farmer getFroilanda() {
        return froilanda;
    }

    public void rideHorse() {
        List<Person> farmerList = farm.getFarmHouse().getFarmers();
        for(Person p : farmerList){
            Farmer farmer = (Farmer)p;
            for(Horse horse : farm.getHorses()) {
                farmer.mount(horse);
                farmer.dismount(horse);
                for(int i =0; i < 3; i++) {

                   // horse.eat(farm.getCorn(3));
                }
            }
        }
    }
}
