package arrays.exerciseArrays;

import java.util.Scanner;

public class magicSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int givenNum = Integer.parseInt(scanner.nextLine());

        int[] array = new int[numbers.length];

        for (int i = 0; i <numbers.length ; i++) {

            array[i] = Integer.parseInt(numbers[i]);

        }

        for (int i = 0; i < array.length ; i++) {

            for (int j = i+1; j <array.length ; j++) {

                if (array[i]+array[j]==givenNum){

                    System.out.printf("%d %d\n",array[i], array[j]);

                }

            }

        }


    }
}