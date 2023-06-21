package src.Senai.week_2_Java_Coding;

public class SwapWithVariable {
public static void swapVar(int x, int y){
    int z = x;
    x = y;
    y = z;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
}

    public static void main(String[] args) {
        swapVar(3,7);
    }

}
