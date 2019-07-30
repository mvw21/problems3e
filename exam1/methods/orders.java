package methods;

import java.util.Scanner;

public class orders {
    public static void switchCommand(String command, int quantity,double price) {
        switch(command){
            case "coffee":
                price = 1.50*quantity;
                System.out.printf("%.2f",price);
                break;
            case "water":
                price = 1.00*quantity;
                System.out.printf("%.2f",price);
                break;
            case "coke":
                price = 1.40*quantity;
                System.out.printf("%.2f",price);
                break;
            case "snacks":
                price = 2.00*quantity;
                System.out.printf("%.2f",price);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();


        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switchCommand(a,quantity,0);

    }
}
