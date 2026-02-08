package com.practice;
public class AreaMain {

    public static void main(String[] args) {

        // 1️⃣ Using Circle class (implements Area)
        Circle c1 = new Circle(14.5);
        System.out.println("Area of Circle = " + c1.getArea());

        // 2️⃣ Anonymous class implementing Area (Rectangle)
        Area r1 = new Area() {
            @Override
            public double getArea() {
                int l = 10;
                int b = 20;
                return l * b;
            }
        };

        System.out.println("Area of Rectangle = " + r1.getArea());
    }
}

/* ---------- Interface ---------- */
interface Area {
    double pi = 3.14;        // public static final by default
    double getArea();        // public abstract by default
}

/* ---------- Class implementing interface ---------- */
class Circle implements Area {

    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi * r * r;
    }

    public void displayArea() {
        System.out.println("Area of Circle = " + getArea());
    }
}