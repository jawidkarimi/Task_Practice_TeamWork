package src.Ono.week5;

public class UniqueCharacter {

    public static void findUniqueElement(String str){

        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {

                if(ch == str.charAt(i)){
                    frequency++;
                }
            }
                if(frequency ==1){
                    unique+=ch;
                }

        }
        System.out.println(unique);

    }
    public static void main(String[] args) {
        findUniqueElement("ABCCCDEEED");
    }
}
