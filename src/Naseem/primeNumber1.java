package src.Naseem;

public class primeNumber1 {


    public static void main(String[] args) {

        primeNumber();

    }

    public static void primeNumber( ){

        int num = 29;

        boolean flag = false;
        for (int i = 2; i <= num /2 ; i++) { //if condition not prime
            if(num % i == 0 ){
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not prime number");
    }





}
// write  a method that can check if a number is prime or not










