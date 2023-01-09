package basicexamples;

public class Variables {
    public static void main(String[] args) {
        // Definovanie premennych robime na zaciatku
        float myFloatNum = 5.99f;
        char myLetter = 'D'; // AltGr + p reprezentuje apostrof '
        boolean myBool = true;
        final double conversionRate = 30.126; // Konstantu definujeme klucovym slovom final a je nemenna
        // conversionRate = 24.123; // tato cast skonci s chybou !!! kedze sa jedna o konstantu (final)
        int myNum;
        myNum = 15;
        String name = "John";

        System.out.println("Konverzny  kurz Eur / SK je " + conversionRate + " ku dnu 21.12.2022.");
        System.out.println("Moje meno je " + name);
        System.out.println("Vypisujem cele cislo " + myNum);
        System.out.println("Vypisujem desatinne cislo " + myFloatNum);
        System.out.println("Vypisujem pismeno, ktore je toto:" + myLetter);
        System.out.print("A toto je hodnota typu boolean premennej "+ myBool);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // Spoji obsah 2 premennych a to firstName a lastName a vysledok vrati do premennej fullName
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int result = x + y;
        System.out.println("Vysledok suctu je: " + result); // Scita hodnoty premennych x a y, cize vysledok bude 11

        // Zadanie: Vypis text Vysledok scitanie 3 premennych (a, b, c) je:
        // a k tomu vysledok tych premennych.
        int a = 5, b = 6, c = 50;
        System.out.println("Vysledok scitania 3 premennych (a=" + a + ", b=" + b + ", c=" + c + ") je: " + (a + b + c));
        String cas = "16.30"; // cas skolnia sa moze menit, chcem o tom informovat oznamom
        System.out.println("Dnes o " + cas + "hod. sa zacal kurz Java developer Junior.");

        String meno = "Anna";
        String priezvisko = "Sabovikova";
        System.out.println("Meno zamestanca je:" + meno + " " + priezvisko);




    }

}
