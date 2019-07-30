package arrays;

import java.util.Scanner;

public class evenOddSubtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");

        int oddSum=0;
        int evenSum=0;

        for (int i = 0; i < string.length; i++) {
            int num = Integer.parseInt(string[i]);
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
        }

        int diff = (evenSum-oddSum);
        System.out.println(diff);

    }
}