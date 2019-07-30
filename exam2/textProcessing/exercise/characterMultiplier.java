package textProcessing.exercise;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        String word1 = line[0];
        String word2 = line[1];


        int result =0;

        if(word1.length()>=word2.length()){
            for (int i = 0; i <word2.length() ; i++) {
                result+= word1.charAt(i) * word2.charAt(i);

            }

            int diff = word1.length()-word2.length();

            for(int i = word1.length()-1; i>=word2.length();i--){
                int currentChar = word1.charAt(i);
                result+=currentChar;
            }
        }else{
            for (int i = 0; i <word1.length() ; i++) {
                result+= word1.charAt(i) * word2.charAt(i);

            }

            for (int i = word2.length()-1; i >=word1.length() ; i--) {
                result+= word2.charAt(i);
            }

        }
        System.out.println(result);

    }
}
