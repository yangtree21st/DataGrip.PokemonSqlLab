package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import org.junit.Test;

public class WorkWeekDay1Test {
    FroilanFarm froilanFarm;
    Farmer frolian;
    Farmer frolianda;
    public WorkWeekDay1Test(){
        froilanFarm = new FroilanFarm();
    }
    @Test
    public void morningTest(){
        frolian = froilanFarm.getFroilan();
        frolianda = froilanFarm.getFroilanda();
    }
    public void RideHorse(){

        froilanFarm.rideHorse();
    }
}
