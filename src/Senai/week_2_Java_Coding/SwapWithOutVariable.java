package src.Senai.week_2_Java_Coding;

public class SwapWithOutVariable {
public static void Swap(int x, int y){

   x = x + y;
   y = x - y;
   x = x - y;

    System.out.println("x = " + x);
    System.out.println("y = " + y);

}
    public static void main(String[] args) {
        Swap(8,9);
        System.out.println("---------------------");
        Swap(5,6);
    }
}

//Swap two variable values without using a third variable
