package src.khalil;

import java.util.Arrays;

public class Khalil_ArrayFindMinimum {

    public static void main(String[] args) {
        int a[]={423,6,46,34,23,13,53,4};

        //Implemented inbuilt function to sort array
        Arrays.sort(a);

        // after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("Minimum int number is ==> "+a[0]);
    }

}
