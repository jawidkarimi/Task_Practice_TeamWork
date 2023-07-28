package src.milgin46.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMoreThan100InArraylist {

        public static void main(String[] args) {
            // Given list of Integers
            List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 102, 103, 107));

            // Remove all values greater than 100
            numbers.removeIf(number -> number > 100);

            // Print the updated list
            System.out.println(numbers); // Output: [1, 2, 3, 4, 5, 6]
        }
    }
////3) ArrayList - Remove some values
////  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.