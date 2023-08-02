package src.milgin46.week10;

import java.util.*;

public class SortMapByTheValues {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("John", 25);
        unsortedMap.put("Alice", 20);
        unsortedMap.put("Bob", 30);
        unsortedMap.put("Eva", 22);

        // Sort the map by values in ascending order
        Map<String, Integer> sortedMap = sortByValues(unsortedMap);

        System.out.println("Unsorted Map: " + unsortedMap);
        System.out.println("Sorted Map (Ascending): " + sortedMap);
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getValue() > list.get(j).getValue()) {
                    Map.Entry<String, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}

//3. Map - Sort the map by values
//  Write a method that can sort the Map by values.