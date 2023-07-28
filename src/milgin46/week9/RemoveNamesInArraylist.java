package src.milgin46.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNamesInArraylist {

    public static void main(String[] args) {
        // Given list of people's names
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Alice", "Ahmed"));

        // Remove all occurrences of the name "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        // Print the updated list
        System.out.println(names); // Output: [John, Eric, Alice]
    }

}


//
//2) ArrayList - Remove "Ahmed"
//  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
//  Write a java operation to remove all the names named 'Ahmed'
//
