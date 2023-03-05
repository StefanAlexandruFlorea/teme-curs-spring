package com.devmind.app;

public class Dog implements IAnimal{

    String animalName;

    public Dog(){
    }

    public Dog(String name){
        this.animalName=name;
    }
    @Override
    public String makeSound() {
        return "ham-ham";
    }
}
