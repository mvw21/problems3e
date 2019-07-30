package methods.methodsExercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        System.out.println(middleString(line));

    }
    static String middleString(String line){
        String neededString = "";

        if(line.length()%2==0){
        String a = Integer.toString(line.length());
        int b = Integer.parseInt(a);
            for (int i = b/2-1; i <b/2+1 ; i++) {
                neededString+= line.charAt(i);
            }

        }else{
            String a = Integer.toString(line.length());
            int b = Integer.parseInt(a);
            int length = b/2;
            for (int i = length; i <length+1 ; i++) {
                neededString+= line.charAt(i);
            }
        }
        return neededString;
    }
}
