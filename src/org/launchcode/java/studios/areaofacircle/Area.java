package org.launchcode.java.studios.areaofacircle;

public class Area {
    public static void main(String[] args) {
        double radius;
        double Area;
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();

            input.close();


            // Area = (radius * radius * 3.14);
            Area = Circle.getArea(radius);
            System.out.println("The are of a circle of radius " + radius + "is: " + Area);
        }
}
