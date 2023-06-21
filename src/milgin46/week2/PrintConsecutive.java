
package src.milgin46.week2;

import java.util.ArrayList;

public class PrintConsecutive {
    public static void main(String[] args) {

        int n = 100;
        ArrayList<String> list = new ArrayList<>();



            for (int i = 1; i <= n; i++) {
                String word = "";

                if (i % 2 == 0)
                    word += "Codility";

                if (i % 3 == 0)
                    word += "Test";

                if (i % 5 == 0)
                    word += "Coders";

                if (word.isEmpty())
                    word = String.valueOf(i);

                list.add(word);
            }


        for (String each : list) {
            System.out.println(each);
        }

    }
}
/*
3️⃣ Numbers -- print consecutive numbers
Write a function that, given a positive integer N,
 prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible
 by 2, 3 or 5 should be replaced by the word
 Codility, Test or Coders respectively. If a number
 is divisible by more than one of the numbers: 2,3 or 5,
 it should be replaced by a concatenation of the respective words Codility,
 Test and Coders in this given order. For example, numbers
 divisible by both 2 and 3 should be replaced
 by CodilityTest and numbers divisible by all three numbers: 2,3 and 5,
 should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */