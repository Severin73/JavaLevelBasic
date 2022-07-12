package com.javalevelbasic.task41;

/**
 * Describe the "Cat" class (you can take a pet as a sample). Endow it with properties and methods.
 * Create multiple instances of objects of this class. Use these objects.
 */
public class CatRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(7);
        cat.setWeight(10);
        cat.isFat(cat.getWeight());

        System.out.println();

        Cat cat2 = new Cat("Barbora", "Black", 5, 4, 15);
        cat2.isFat(cat2.getWeight());
        cat2.meov();
        cat2.feedCat(20);
        cat2.feedCat(30);
        cat2.feedCat(50);
        cat2.feedCat(-110);

        System.out.println();

        Cat cat3 = new Cat("Mars", "White", 3, 17, 95);
        cat3.isFat(cat3.getWeight());
        cat3.getFeedStatus();
        cat3.feedCat(70);
        cat3.getFeedStatus();
        cat3.feedCat(50);
    }
}
