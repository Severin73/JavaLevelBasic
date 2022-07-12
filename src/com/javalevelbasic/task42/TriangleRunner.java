package com.javalevelbasic.task42;

/**
 * Describe the "Triangle" class. Take the lengths of the sides of the triangle as properties.
 * Implement a method that will return the area of this triangle.
 * Create several objects of this class and test them.
 */
public class TriangleRunner {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(5, 4, 3);
        System.out.println("Area = " + triangle1.getArea());

        Triangle triangle2 = new Triangle(-1, 4, 2);
        System.out.println("Area = " + triangle2.getArea());

        Triangle triangle3 = new Triangle(0, 18, 4);
        System.out.println("Area = " + triangle3.getArea());

        Triangle triangle4 = new Triangle(100, 18, 4);
        System.out.println("Area = " + triangle4.getArea());
    }
}
