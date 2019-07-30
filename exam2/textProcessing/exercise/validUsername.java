package textProcessing.exercise;

import java.util.Scanner;

public class validUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");



        for(String s : line){
            if((s.length()>=3 && s.length()<=16) && (isContaining(s))){
                System.out.println(s);
            }
        }
    }

    private static boolean isContaining(String s){
        boolean isContaining = true;
        for (int i = 0; i <s.length() ; i++) {
            int counter = 0;
            char newChar = s.charAt(i);
            if(Character.isLetter(newChar)){
                counter++;


            }
            if(Character.isDigit(newChar)){
                counter++;
            }
            if((newChar == '-') || newChar == '_'){
                counter++;

            }
            if(counter ==0){
                isContaining=false;
                break;
            }
        }
        return isContaining;
    }

}
