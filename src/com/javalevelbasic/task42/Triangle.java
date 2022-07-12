package com.javalevelbasic.task42;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isTriangle() {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return !(a + b <= c) && !(a + c <= b) && !(b + c <= a);
    }

    public double getArea() {
        if (!isTriangle()) {
            return 0;
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
