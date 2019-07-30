package arrays;

import java.util.Scanner;

public class condenceArratToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < string.length-1; i++) {
            int num = Integer.parseInt(string[i]);
            int num2 = Integer.parseInt(string[i+1]);
            sum+= num+num2;
            if(sum<10){

            }
        }
        System.out.println(sum);
    }
}