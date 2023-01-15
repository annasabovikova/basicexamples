package basicexamples.exercises;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj percento testu");
        int percent = scn.nextInt(); // Input value for percent is int

        if (percent > 90 ){
            System.out.println("Dostal si zmanku A");
        }else if (percent > 75) {
            System.out.println("Dostal si znamku B");
        } else if (percent > 65) {
            System.out.println("Dostal si znamku C");
        }else {
            System.out.println("Dostal si znamku F. Nespravil si test.");
        }
    }
}
