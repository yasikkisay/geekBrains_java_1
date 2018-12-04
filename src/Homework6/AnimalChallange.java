package Homework6;

import java.util.*;

public class AnimalChallange {

    public static void main(String[] args) {

//        Cat cat1 = new Cat(200f, 2f);
//        Dog dog1 = new Dog(500f, 0.5f, 10f);
//
//        Cat cat2 = new Cat(200f, 2f);
//
//        System.out.println(cat1.run(250));
//        System.out.println(dog1.swim(11));
//
//        cat2.setRunLimit(300);
//        System.out.println(cat2.run(250));

//        AnimalType animalType = AnimalType.DOMESTIC;
//        System.out.println(animalType.animalTypeName);

//        Cat cat2 = new Cat(200f, 2f);
//        cat2.setDomesticatedType(Animal.AnimalType.DOMESTIC.animalTypeName);
//        System.out.println("Мой кот - это " + cat2.getDomesticatedType().toLowerCase() + " живоное.");

        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("James");
        names.add("Andrew");

        ArrayList<Integer> busNumbers = new ArrayList<>();
        busNumbers.add(1);
        busNumbers.add(13);
        busNumbers.add(30);
        busNumbers.add(66);

        Showcase<String> nameShowcase = new Showcase<>();
        nameShowcase.setShowcase(names);
        System.out.println(nameShowcase.getShowcase());

        Showcase<Integer> busShowcase = new Showcase<>();
        busShowcase.setShowcase(busNumbers);
        System.out.println(busShowcase.getShowcase());

        HashMap user = new HashMap();
        user.put("name", "Bob");
        user.put("age", 22);
        System.out.println(user);
        System.out.println("Name: " + user.get("name") + "Age: " + user.get("age"));
    }
}
