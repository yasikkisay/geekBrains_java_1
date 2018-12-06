package Homework7;

import java.util.ArrayList;
import java.util.Arrays;

public class HungerGames {

    public static void main(String[] args) {

        Plate plate1 = new Plate();
        plate1.fillPlate();

        Cat cat1 = new Cat(100, "Tom");
        Cat cat2 = new Cat(80, "Bars");
        Cat cat3 = new Cat(120, "Pushok");

        ArrayList<Cat> catList = new ArrayList<>(Arrays.asList(cat1, cat2, cat3));

        catList.forEach((cat) -> {
                cat.eat(plate1, 110);
                System.out.println(cat.getName() + " поел и он " + cat.getHungerType());
                System.out.println("Его сытость - " + cat.getCurrentFed() + " из " + cat.getFedLimit());
        });
    }
}
