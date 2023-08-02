package src.milgin46.week10;

import java.util.ArrayList;

public class SortArraylistDesc {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Sort the ArrayList in descending order
        descendingSort(numbers);

        System.out.println("Sorted List (Descending): " + numbers);
    }

    public static void descendingSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}

//2. ArrayList - sorting in descending order
//  Write a method that can sort the ArrayList in descending order without
//using the sort method.
