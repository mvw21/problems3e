package methods.methodsExercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        System.out.println(print(password));





    }

    static boolean lengthCheck(String password){
        boolean passcheck = false;
        if(password.length()>=6 && password.length()<=10){
            passcheck = true;
        }
        return passcheck;
    }

    static boolean lettersAndDigits(String password){
        boolean onlyLettersAndDigits = true;

        for (int i = 0; i <password.length() ; i++) {
            char letter = password.charAt(i);
            if (!((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57))) {
                onlyLettersAndDigits = false;
                break;


            }
        }
        return onlyLettersAndDigits;
    }

    static boolean digitsCounter(String password){
        int counter = 0;
        boolean digitsCounterCheck = false;
        for (int i = 0; i <password.length() ; i++) {
            char letter = password.charAt(i);
            if(letter>=48 && letter<=57){
                counter++;
            if(counter>=2){
             digitsCounterCheck=true;
             break;
            }
            }
        }
        return digitsCounterCheck;
    }
    static String print(String password){
        String line = "";
        if(lengthCheck(password) && lettersAndDigits(password) && digitsCounter(password)){
            line+="Password is valid";
        }
        if(!lengthCheck(password)){
            line+="Password must be between 6 and 10 characters"+"\n";
        }
        if(!lettersAndDigits(password)){
            line+="Password must consist only of letters and digits"+"\n";
        }
        if(!digitsCounter(password)){
            line+="Password must have at least 2 digits";
        }
        return line;
    }


}
