package arrays.exerciseArrays;

import java.util.Scanner;

public class zigZagArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split( " ");

            int firstNumber = Integer.parseInt(input[0]);
            int secondNumber = Integer.parseInt(input[1]);

            if(i%2==0){
                first[i] = firstNumber;
                second[i]= secondNumber;
            }else{
                second[i] = firstNumber;
                first[i] = secondNumber;
            }
        }

        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]+" ");

        }
        System.out.println();
            for(int i = 0; i<second.length;i++){
                System.out.print(second[i]+ " ");
            }
    }
}
