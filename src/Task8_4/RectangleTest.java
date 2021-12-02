package com.company.Task8_4;
import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle(2.4, 12.4);
        Rectangle rect2 = new Rectangle();

        System.out.println("******* Rectangle with getMethod() *******");
        System.out.println("Width = "+rect.getWidth());
        System.out.println("Length = "+rect.getLength());
        System.out.println("Perimeter = "+rect.getPerimeter(rect.getWidth(), rect.getLength()));
        System.out.println("Perimeter = "+rect.getArea(rect.getWidth(), rect.getLength()));

        System.out.println();

        System.out.println("******* Rectangle with setMethod() *******");
        System.out.print("Enter width --> ");
        double width = input.nextDouble();
        rect2.setWidth(width);

        System.out.print("Enter length --> ");
        double length = input.nextDouble();
        rect2.setWidth(length);

        System.out.println("Perimeter --> "+rect2.getPerimeter(width, length));
        System.out.println("Area --> "+rect2.getArea(width, length));
    }
}