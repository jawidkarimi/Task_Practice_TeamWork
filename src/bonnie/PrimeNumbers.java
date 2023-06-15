package src.bonnie;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 12;

        if(isPrime(num)){
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
    }
    
    public static boolean isPrime(int num) {


        if(num <= 1){
            return false;
        }

        for(int i=2; i<=num/2; i++){

            if(num % i == 0)
                return false;
        }

        return true;
    }

}

