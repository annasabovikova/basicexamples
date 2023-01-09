package basicexamples;

public class Operators5 {
    public static void main(String[] args) {
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int number1 = 0;
        System.out.println(++number1);

        int number2 = 0;
        System.out.println(--number2);

        int x = 10;
        x +=5; // is same as x ´x + 5;
        System.out.println(x);

        System.out.println();

        double number3 = 8, number4 = 4, modulus, division;
        modulus = number3 % number4;
        division = number3 / number3;

        System.out.println("Prve cislo je " + number3);
        System.out.println("Druhe cislo je " + number4);

        System.out.println("Zvysok po deleni je " + modulus);
        System.out.println("Delenie je " + division);

        if (modulus == 0) {
            System.out.println("Cislo je parne");
        } else {
            System.out.println("Cislo je neparne");
        }


    }
}
