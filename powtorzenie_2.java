//Napisz statyczną metodę copyArrayWithIndex, która przyjmuje listę tablicową liczb całkowitych oraz indeks początkowy i końcowy jako argumenty. Funkcja powinna zwrócić nową listę tablicową zawierającą elementy pierwotnej liście tablicowej od indeksu początkowego do końcowego (włącznie). Na przykład, dla liście tablicowej [1, 2, 3, 4, 5] i indeksów 1 i 3, funkcja powinna zwrócić [2, 3, 4]. Stwórz przypadek testowy.

import java.util.ArrayList;

public class copyArrayWithIndex {

    public static ArrayList<Integer> copyArrayWithIndex(ArrayList<Integer> list, int start, int end) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            result.add(list.get(i));
        }

        return result;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends copyArrayWithIndex {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> copied = copyArrayWithIndex(numbers, 1, 3);

        System.out.println("Oryginalna lista: " + numbers);
        System.out.println("Skopiowany fragment: " + copied);
    }
}
