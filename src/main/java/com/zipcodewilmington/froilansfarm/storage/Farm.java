package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.storage.field.Field;
import com.zipcodewilmington.froilansfarm.vehicle.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicle.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicle.interfaces.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    Field field;
    List<Stable> stables = new ArrayList<Stable>();
    List<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    FarmHouse farmHouse;
    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }
    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Aircraft getAvailableAirCraft(){
        Aircraft aircraft = null;
        for (Vehicle vehicle: vehicles){
            if(vehicle instanceof Aircraft){
                vehicles.remove(vehicle);
                aircraft = (Aircraft) vehicle;
                break;
            }
        }
        return  aircraft;
    }

    public FarmVehicle getAvailableFarmVehicle(){
        FarmVehicle farmVehicle = null;
        for (Vehicle vehicle: vehicles){
            if(vehicle instanceof Aircraft){
                vehicles.remove(vehicle);
                farmVehicle = (FarmVehicle) vehicle;
                break;
            }
        }
        return  farmVehicle;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public List<Horse> getHorses() {
        List<Horse> horses = new ArrayList<Horse>();
        for(Stable stable : stables){
            horses.addAll(stable.getHorses());
        }
        return horses;
    }
    public CornStalk getCorn()
    {
        return null;
        //for(Crop crop : field.get)

    }
}
