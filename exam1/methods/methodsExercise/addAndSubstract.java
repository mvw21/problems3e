package methods.methodsExercise;

import java.util.Scanner;

public class addAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(num1,num2);
        int substract = substract(sum,num3);
        System.out.println(substract);
    }
    static int sum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    static int substract(int sum,int num3){
        int substract = sum - num3;
        return substract;
    }


}

