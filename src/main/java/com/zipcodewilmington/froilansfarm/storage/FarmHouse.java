package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    List<Person> persons = new ArrayList<Person>();
    public void add(Person person)
    {
        persons.add(person);
    }

    public List<Person> getFarmers() {
        return persons;
    }
}
