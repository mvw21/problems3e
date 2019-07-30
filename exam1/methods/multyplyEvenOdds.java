package methods;

import java.util.Scanner;

public class multyplyEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        num = Math.abs(num);
        System.out.println(check(num));

    }
        static int check(int num){

            String numString = Integer.toString(num);
            int evenSum = 0;
            int oddSum = 0;
            int result = 0;
            if(num<10){
                result=num;
                return result;
            }
            for (int i = 1; i <=numString.length() ; i++) {
                char letter = numString.charAt(i-1);
                int letterNum = Character.getNumericValue(letter);
                if(i%2==0){
                    oddSum+=letterNum;
                }else{
                    evenSum+=letterNum;
                }
            }
            result = oddSum*evenSum;
            return result;
    }

    }


