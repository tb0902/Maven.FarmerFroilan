package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Eater_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.NoiseMaker_Interface;

public class Animal implements Eater_Interface, NoiseMaker_Interface {
    String name;
    public Animal(String name) {
        this.name = name;
    }
}