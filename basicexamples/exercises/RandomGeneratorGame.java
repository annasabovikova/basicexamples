package basicexamples.exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomGeneratorGame {
        public static void main(String[] args) {

        /*Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ
        musí uhádnuť číslo. Ak uhádne menšie, tak mu Java vypíše Neuhádol si, moje
        číslo je menšie, analogicky Neuhádol si, moje číslo je väčšie a pri úspešnom
        uhádnutí BINGO! Uhádol si!
                Bonusová úloha:
        Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.

         */


            Random randomObject = new Random();
            int randomValue = randomObject.nextInt(10) + 1; //Vygeneruje cislo od 0 do 10 ako int
            // System.out.println(" Toto je nahodne vygenerovane cislo " + randomValue);

            System.out.println("Ahoj, myslim si cislo o 1 do 10.Skus ho uhadnut");

            int inputUserNumber = 0;

            //Start cyklus s podmienkou je prikaz while (podmienka kym nie je splnena) { dalsie prikazy}
            while (inputUserNumber != randomValue) {
                System.out.println("Zadaj cislo a potvrd enter");

                Scanner objectScanner = new Scanner(System.in);// Trieda Scanner sluzi na uzivatelsky vstup, System.in priamo na vstup z konzoly (okna Run)
                inputUserNumber = objectScanner.nextInt(); // Priamy uzivatelsky vstup,vyzaduje cele cislo

                if (inputUserNumber > randomValue) {
                    System.out.println("Neuhadol si.Moje cislo je mensie");
                } else if (inputUserNumber < randomValue) {
                    System.out.println("Neuhadol si.Moje cislo je vacsie");
                } else {
                    System.out.println("Bingo!Uhadol si");
                    System.out.println(" Toto je nahodne vygenerovane cislo " + randomValue);
                }
            }

        }}

