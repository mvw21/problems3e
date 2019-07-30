package methods.methodsExercise;

import java.util.Scanner;

public class topNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(check(num));

    }

    static String check(int num) {
        String result = "";
        for (int i = 1; i <=num; i++) {
            String intToString = Integer.toString(i);

            int sum = 0;
            int oddCunter = 0;
            for (int j = 0; j < intToString.length(); j++) {
                char letter = intToString.charAt(j);
                int num3 = Character.getNumericValue(letter);
                sum += num3;
                if (num3 % 2 != 0) {
                    oddCunter++;
                }
            }
            if (sum % 8 == 0 && oddCunter >= 1) {
                String needed = Integer.toString(i);
                result += needed + "\n";
            }
        }
            return result;
    }


}