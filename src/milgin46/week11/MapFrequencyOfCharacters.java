package src.milgin46.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "Hello World";
        printCharacterFrequency(input);
    }

    public static void printCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (frequencyMap.containsKey(c)) {
                    frequencyMap.put(c, frequencyMap.get(c) + 1);
                } else {
                    frequencyMap.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
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
