//Napisz statyczną metodę copyArray, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca nową listę tablicową, która jest kopią pierwotnej. Funkcja powinna skopiować listę tablicową ręcznie, element po elemencie, bez korzystania z systemowych metod kopiowania. Stwórz przypadek testowy.

import java.util.ArrayList;

public class copyArray {

    public static ArrayList<Integer> copyArray(ArrayList<Integer> original) {
        if (original == null) {
            return null;
        }

        ArrayList<Integer> copy = new ArrayList<>();

        for (int i = 0; i < original.size(); i++) {
            copy.add(original.get(i));
        }

        return copy;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> oryginalnaLista = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        ArrayList<Integer> skopiowanaLista = copyArray.copyArray(oryginalnaLista);

        System.out.println("Oryginalna lista po zmianach: " + oryginalnaLista);
        System.out.println("Skopiowana lista:             " + skopiowanaLista);
    }
}

