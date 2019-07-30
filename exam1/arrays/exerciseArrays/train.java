package arrays.exerciseArrays;

import java.util.Scanner;

public class train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];

        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
             wagons[i]= num;

        }

        int count = 0;
        for (int index = 0; index < wagons.length; index++) {
            int people = wagons[index];
            count+=people;
            System.out.print(people + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}