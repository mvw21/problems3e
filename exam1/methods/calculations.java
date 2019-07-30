package methods;

import java.util.Scanner;

public class calculations {
    public static void multiply(int a , int b) {
        int result = a*b;
        System.out.println(result);
    }
    public static void divide(double a, double b) {
        double result =  a/ b;
        System.out.printf("%.0f",result);
    }
    public static void add(int a , int b) {
        int result = a+b;
        System.out.println(result);
    }
    public static void subtract(int a, int b) {
        int result = a-b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        switch(input){
            case "subtract":subtract(a,b);
            break;
            case "add":add(a,b);
            break;
            case "multiply":multiply(a,b);
            break;
            case "divide":divide(a,b);
        }


    }
}
