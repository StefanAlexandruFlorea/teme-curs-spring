package com.devmind.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {
    public static void main(String[] args) {
        var context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal dog = context.getBean("dog",Dog.class);
        System.out.println(dog.makeSound());

        IAnimal cat = context.getBean("cat",Cat.class);
        System.out.println(cat.makeSound());

    }
}