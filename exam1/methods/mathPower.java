package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double x = mathPower(number,power);
        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));
    }
}
