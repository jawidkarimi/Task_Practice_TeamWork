package src.milgin46.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

            System.out.println(reversenumbers(-35));
        }

        public static int reversenumbers(int n) {

        int rev = 0;

          while(n != 0){
            rev = rev *  10 + (n % 10);
            n/= 10;
            }

            return rev;
        }
    }

/*
2️⃣ Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */