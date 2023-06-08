package src.Naseem;

   public class ReversedNumber {


        public static void main(String[] args) {
            Reversed();
        }


        public static void Reversed (){

            int num = -35 , reversed = 0;

            System.out.println("Original Number:" + num);

            // run loop until num becomes 0
            while(num != 0) {

                // get last digit from num
                int digit = num % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from num
                num /= 10;
            }

            System.out.println("Reversed Number: " + reversed);

        }
    }













