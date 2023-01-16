package basicexamples.exercises;

import java.util.Scanner;
//Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý
//bude v centimetroch. Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do
//“konzoly”. Program pôjde dovtedy, kým nezadáme slovo: koniec.
       /*// Hint:
        Vzorec na výpočet obsahu kruhu je nasledujúci:
        S = π.r²
        Vzorec na výpočet obvodu kruhu je:
        o = 2.π.r
        Bonusová úloha: vytvorte metódy z daných vzorcoch.*/

public class Circle {
    public static double getAreaOfCircle(double r) {
        double areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;


    }

    public static double getCircumferenceOfCircle(double r) {
        double circumferenceOfCircle = 2 * Math.PI * r;
        return circumferenceOfCircle;
    }

    public static void printText(String str) {
        System.out.println(str);
        System.out.println();
    }


    public static void main(String[] args) {
        double r, circumferenceOfCircle, areaOfCircle; //polomer,ovod,obsah

        Scanner scn = new Scanner(System.in);//inicializacia skeneru potrebneho pre vstup
        //ŠTART , toto opakovat
        while (true) {
            System.out.println("Zadaj polomer(r) ");
            r = scn.nextDouble();

            if (r <= 0) { //Pri zadani nuly alebo zadani zaporneho cislapodmienky pri IF mozu vyzerat pri cislach nasledovne" ==  !=  <  >
                printText("Koniec");
                break; //ak polomer bude -1 tak ukonci cyklus s podmienkou,cize uz sa program
            }
            areaOfCircle = Math.PI * Math.pow(r, 2);// vypocet obsahu kruhu
            circumferenceOfCircle = 2 * Math.PI * r;


            System.out.println("Zadany polomer " + r);
            System.out.println("Obsah kruhu je " + areaOfCircle);
            System.out.println("Obvod kruhu je " + circumferenceOfCircle);
            //Koniec , toto opakovat


        }
    }
}
