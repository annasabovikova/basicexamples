package basicexamples.revision;

/*
Trieda vypise nasledujuci text do konzoly, pricom hodnoty ako datum, znamka, rok a aktualny datum moze pouzivatel menit cez premenne.
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku
1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java
programátor.
V Bratislave dňa 18.06.2022
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VariablesExamplesUserInput {
    public static void main(String[] args) {
        String text1 = "Študent Jozef Mrkvička sa narodil ";
        String date = "";
        String text2 = " z maturitnej skúšky má známku ";
        float grade = 0f; // TODO Print grade with coma

       // grade = grade + 0.5f;
        String gradeWithComma = String.format("%.1f",grade);
        String text3 = " a od septembra";
        int year = 2022;
        String text4 = " nastúpi do nového zamestnania ako Java programátor.)%n";
        String text5 = "V Bratislave dňa ";

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj datum:");
        date = scn.nextLine();

        System.out.println("Zadaj znamku");
        grade = scn.nextFloat();
        gradeWithComma = String.format("%.1f ,grade");

        System.out.println("Zadaj rok");
        year = scn.nextInt();




        //String currentDate = "18.06.2022 %n";

        //String currentDate = String.valueOf(java.time.LocalDate.now()); // Get current date but problem with its format
        //LocalDate currentDate = java.time.LocalDate.now();
        // String formattedCurrentDate =
        //SimpleDateFormat currentDateInSlovakia = new SimpleDateFormat("dd.MM.yyyy currentDate,)

        //String wholeText = text1 + date + text2 + gradeWithComma + text3 +  year  + text4 + text5 + currentDate;

       // System.out.printf(wholeText);
        //System.out.println(java.time.LocalDate.now());

        // STEP 3:
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); // Date format
        Date currentDate = new Date();// Get current Date and Time
        String formattedCurrentDate = dateFormat.format(currentDate); // Change currentDate*/

        String wholeText = text1 + date + text2 + gradeWithComma + text3 + year + text4 + text5 + formattedCurrentDate;
        System.out.printf(wholeText);

        //TODO Ak ma znamku do 1,5 vratane, tak vyoisem prijaty, v opacom pripade NIE JE PRIJATY.
        if (grade <= 1.5f) {
            System.out.println("%nJE PRIJATY");
            System.out.println("SUPER");
        } else if (grade > 1.5f);

        }


    }

