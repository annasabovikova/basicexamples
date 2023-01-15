package basicexamples.exercises;

import java.text.Normalizer;
import java.util.Scanner;

public class GradeConvecter {

    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;}

    public static void main(String[] args) {

        /*Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný,
                dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku.*/

        String gradeAsText = "";
        Scanner scn = new Scanner(System.in);// inicializacia konzoly
        //Štart cyklu
        while (true) { // while (true) reprezentuje nekonecny cyklu, kym niekde nenapiseme prikaz break

            System.out.println("\n Zadaj známku slovne : výborný, chválitebný, dobrý, dostatočný, nedostatočný");
            System.out.println("Ukončenie programu , zadaj slovo: Koniec");

            // int znamka = scn.nextInt(); // toto by nepreslo, alebo nedava zmysel, lebo chceme text
            gradeAsText = scn.nextLine(); // od pouzivatela program caka napisat text (textovu znamku) a tu ulozime do gradeasText
            System.out.println("Vstupný text známky od pouzivatela bol nasledujuci: " + gradeAsText);


            //my sa musime zbavit diakritiky v premennej gradeAsText
            // to zmnamena, ze premenna gradeAsText nebude obsahovat dlzne ani makcene a preto mozem zmenit IF na nieco:
            gradeAsText = stripAccents(gradeAsText);//tu uz skutocne zmenime obsah premennej gradeAsText tak,ze bude bez diakritiky
            gradeAsText = gradeAsText.toLowerCase();//tu uz zmenime text na male pismena
            gradeAsText = gradeAsText.trim();//Odstranime medzery na zaciatku a na konci text v premennej gradeAsText a vratime spat do premennej

            System.out.println("Napisany text uz bez diakritiky je: " + gradeAsText);

            //Vypiseme cislo znamky ak nie je zadany text koniec
            if (!gradeAsText.equals("koniec")) System.out.print("Vysledna znamka po konverzii z textoveho zadania je: ");


            if (gradeAsText.equals("vyborny"))
                System.out.println("1");
            else if (gradeAsText.equals("chvalitebny"))
                System.out.println("2");
            else if (gradeAsText.equals("dobry"))
                System.out.println("3");
            else if (gradeAsText.equals("dostatocny"))
                System.out.println("4");
            else if (gradeAsText.equals("nedostatocny"))
                System.out.println("5");
            else if (gradeAsText.equals("Koniec"))
                break;//prerusenie cyklu
            else
                System.out.println("Nezadal si slovnú známku správne!");
        }
        //Koniec cyklu
    }
}











