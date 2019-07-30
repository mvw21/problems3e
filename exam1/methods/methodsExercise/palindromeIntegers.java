package methods.methodsExercise;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!line.equalsIgnoreCase("End")){
            if(check(line)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            line = scanner.nextLine();
        }


    }
    static boolean check(String line){
        char first = line.charAt(0);
        char last = line.charAt(line.length()-1);
        boolean areEqual = false;
        if(first==last){
            areEqual=true;
        }
        return areEqual;
    }


  /*  static boolean checkPalindrome(String line){
        char firstChar;
        char lastChar ;

        for (int i = 0; i < line.length(); i++) {
            if(i==0){
                firstChar= line.charAt(i);
            }
            if(i==line.length()-1){
                lastChar= line.charAt(i);
            }
        }

    }*/
}
