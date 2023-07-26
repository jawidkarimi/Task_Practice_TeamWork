package src.Ono.week7;

public class Array_FindMinNum {
    /*
    Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static void main(String[] args) {
        int[] numbers= {99, 12, 23, 32, 44, 57, 6};
        int min = array_findMinNum(numbers);
        System.out.println(min);
    }

    public static int array_findMinNum(int[] numbers){

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

}
