package basicexamples.exercises;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExelBasicFormulas {


    public static double getSum(double[] values) {
        // tu musi byt logika vypoctu
        double sum = 0;
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        return sum;
    }

    public static double getAverage(double[] values) {
        double count = values.length;
        double sum = getSum(values);
        double average = sum / count;

        return average;
    }

    public static double getMax(double[] values) {
        Arrays.sort(values);
        double max = values.length - 1;
        return max;
    }

    public static double getMin(double[] values) {
        Arrays.sort(values);
        double min = values[0];
        return min;

    }

    public static int getCount(double[] values) {
        Arrays.sort(values);
        int count = values.length;
        return count;

    }

    public static void main(String[] args) {
        double[] values = {1, 2, 3}; // naplname pole s nazvom values hodnotami

        // Chceme vypisat vysledky nasledujucich Excel funkcii v poradi: SUM, AVERAGE, COUNT, MAX, MIN


        double sum = getSum(values); // volame metodu getSum, ktora vracia sucet hodnot pola values

        int count = values.length;
        double average = getAverage(values);


        // V premennej sum zostanem posledny sucet
        System.out.println("SUM " + sum);
        System.out.println("AVERAGE " + average);
        System.out.println("COUNT " + count);

        // Ako vypocitat MAX
        Arrays.sort(values); // pole values je zoradene

        double max = getMax(values);
        double min = getMin(values);
        System.out.println("MAX " + max);
        // System.out.println("MAX " + getMax(values)); aj takto sa moze
        System.out.println("MIN " + min);
        // System.out.println("MIN " + getMin(values));
    }


    @Test
    public void testGetSum() {
        double[] values = {1, 2, 3};
        assertEquals(6, getSum(values));

        double[] values2 = {3, 3, 3};
        assertEquals(9, getSum(values2));


    }
    @Test
    public void testGetAverage(){
        double[] values = {1, 2, 3};
        assertEquals(2, getAverage(values));
    }
    @Test
    public void testfGetMax(){
        double[] values = {1, 2, 3};
        assertEquals(3, getMax(values));
    }
    @Test
    public void testGetMin(){
        double[] values = {1, 2, 3};
        assertEquals(1, getMin(values));
    }
    @Test
    public void testGetCount() {
        double[] values = {1, 2, 3};
        assertEquals(3, getCount(values));
    }

}