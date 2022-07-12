package com.javalevelbasic.task41;

public class Cat {

    private String name;
    private String colour;
    private int age;
    private double weight;
    private int saturation;
    private boolean isAlive;

    public Cat(String name, String colour, int age, double weight, int saturation) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
        this.saturation = saturation;
        this.isAlive = true;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSaturation() {
            return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void meov() {
        System.out.println(name + " Mew-mew");
    }

    public void isFat(double weight) {
        if (weight < 6) {
            System.out.println(weight +" Kg = Normal cat weight");
        } else {
            System.out.println(weight + " Kg = Fat cat");
        }
    }

    public boolean feedCat(int feed) {

        int newFeed = getSaturation() + feed;

        if (newFeed < 10) {
            setSaturation(newFeed);
            getFeedStatus();
            return false;
        } else if (newFeed >= 200) {
            setSaturation(newFeed);
            getFeedStatus();
            return false;
        }
        setSaturation(newFeed);
        getFeedStatus();
        return true;
    }

    public void getFeedStatus() {
        if (saturation < 10) {
            setAlive(false);
            System.out.println("The cat died of starvation. " + getSaturation());
        } else if (saturation >= 10 && saturation < 50) {
            System.out.println("The cat is alive, but it needs to be fed. " + getSaturation());
        } else if (saturation >= 50 && saturation < 100) {
            System.out.println("The cat is well-fed, it does not need to be fed. " + getSaturation());
        } else if (saturation >= 100 && saturation < 200) {
            System.out.println("The cat is overfed, it is not necessary to feed. " + getSaturation());
        } else {
            setAlive(false);
            System.out.println("The cat died from overeating. "  + getSaturation());
        }
    }
}
