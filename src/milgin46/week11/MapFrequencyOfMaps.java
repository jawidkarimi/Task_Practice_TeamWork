package src.milgin46.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfMaps {

    public static void main(String[] args) {
        String input = "Hello World";
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char key : frequencyMap.keySet()) {
            System.out.println(key + " -> " + frequencyMap.get(key));
        }
    }
}
//1. Map - Frequency of Characters
//  Write a method that prints the frequency of each character from a String.
//  Ex: Input => "Hello World"
//      Output => Map
//                H -> 1
//                e -> 1
//                l -> 3
//                o -> 2
//                W -> 1
//                d -> 1
//
