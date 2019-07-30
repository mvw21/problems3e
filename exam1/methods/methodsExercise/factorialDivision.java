package methods.methodsExercise;

        import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int num1 = Integer.parseInt(scanner.nextLine());
//        int num2 = Integer.parseInt(scanner.nextLine());

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double result = factorial(num1)/factorial(num2);
        System.out.printf("%.2f",result);
    }
    static double factorial(double a){
        int num1Factorial = 1;
        for (double i = a; i >0 ; i--) {

            num1Factorial*= i;


        }



        return num1Factorial;

    }
}
