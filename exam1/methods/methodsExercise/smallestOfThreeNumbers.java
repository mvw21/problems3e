package methods.methodsExercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {

    static int getMin(int a, int b){
        if(a>b){
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int firstMin = Math.min(num1,num2);

        int min = getMin(firstMin,num3);
        System.out.println(min);

    }
}
