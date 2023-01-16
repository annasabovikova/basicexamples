package basicexamples.exercises;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Rectangle {

    public static double getPerimeter(double a, double b) {
        return 2 * (a + b);
    }

    public static double getArea(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double a;
        double b;


        while (true) {
            Scanner scn = new Scanner(System.in);


            System.out.println("Zadaj hodnotu strany a : ");
            a = scn.nextDouble();

            System.out.println("Zadaj hodnotu strany b : ");
            b = scn.nextDouble();


            double obvod = getPerimeter(a, b);
            double obsah = getArea(a, b);
            System.out.println("Obvod obdlžnika je : " + obvod);
            System.out.println("Obsah obdlžnika je : " + obsah);


        }


    }
}












