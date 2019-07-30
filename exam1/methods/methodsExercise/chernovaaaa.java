package methods.methodsExercise;

import java.util.Scanner;

public class chernovaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[numbers.length-1];

        for (int i = 0; i< input ; i++) {

            numbers2[i] = numbers[i];
        }

        for (int i = input+1; i <numbers.length ; i++) {
            numbers2[i-1] = numbers[i];
        }

        numbers = numbers2;

        for(int n:numbers){
            System.out.print(n);
        }
    }
}
