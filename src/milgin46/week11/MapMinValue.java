package src.milgin46.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {


        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("a", 11);
            map.put("e", 6);
            map.put("l", 3);
            map.put("o", 2);
            map.put("W", 1);
            map.put("d", 1);
            map.put("g", 8);

            int minValue = findMinValue(map);
            System.out.println("Minimum Value: " + minValue);
        }

        public static int findMinValue(Map<String, Integer> map) {
            int minValue = Integer.MAX_VALUE;

            for (int value : map.values()) {
                if (value < minValue) {
                    minValue = value;
                }
            }

            return minValue;
        }
    }
//2. Map - Min value
//  Write a method that can return the minimum value from a map (DO NOT
//use sort method).
//  Ex: Input  => Map
//               Key -> Value
//                a  -> 11
//                e  -> 6
//                l  -> 3
//                o  -> 2
//                W  -> 1
//                d  -> 1
//                g  -> 8
//
//      Output => 1