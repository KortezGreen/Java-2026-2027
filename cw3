package ArrayListDemo;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] tab = {1,2,3,4,5,6,7,8,9,10};
//
//        ArrayList<Integer> listInt = new ArrayList<>();
//        for(int i = 1;i<10;i++)
//        {
//            listInt.add(i);
//        }
//
//                for(int j : listInt) {
//                    System.out.println(j);
//                }

        System.out.println("\nZadanie 1");
        int [] tab1 = new int[10];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i + 1;
        }
        for (int i = tab1.length - 1; i >= 0; i--) {
            System.out.println(tab1[i]);
        }

        System.out.println("\nZadanie 2");
        Random random = new Random();
        int [] tablica = new int[20];
        int suma = 0;
        for(int i = 0;i<tablica.length; i++)
        {
            tablica[i] = random.nextInt(100)+1;
            suma += tablica[i];
            System.out.println(tablica[i]);
        }

        double srednia = (double) suma / tablica.length;
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);

        System.out.println("\nZadanie 3");
        int [] tab3 = new int[15];

        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = i + 1;
        }

        int min = tab3[0];
        int max = tab3[0];

        for (int i = 0; i < tab3.length; i++) {
            if (tab3[i]>max)
            {
                max = tab3[i];
            }
            if (tab3[i]<min)
            {
                min = tab3[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);




    }
}
