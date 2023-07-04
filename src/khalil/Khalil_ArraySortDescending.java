package src.khalil;

import java.util.Arrays;

public class Khalil_ArraySortDescending {

    public static void main(String[] args) {

        int a[]={9,8,0,3};
        System.out.println(Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] < a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
