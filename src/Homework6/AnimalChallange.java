package Homework6;

public class AnimalChallange {

    public static void main(String[] args) {

        Cat cat1 = new Cat(200f, 2f);
        Dog dog1 = new Dog(500f, 0.5f, 10f);

        Cat cat2 = new Cat(200f, 2f);

        System.out.println(cat1.run(250));
        System.out.println(dog1.swim(11));

        cat2.setRunLimit(300);
        System.out.println(cat2.run(250));
    }
}
