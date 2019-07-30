package methods;

        import java.text.DecimalFormat;
        import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.##").format(result(num1,num2,sign)));
    }
    static double result(double num1, double num2,char sign){
        double result = 0;
        int charNum = sign;
        if(charNum == 42){
            result=num1*num2;
        }else if(charNum ==43){
            result= num1+num2;
        }else if(charNum==45){
            result= num1-num2;
        }else if(charNum==47){
            result= num1/num2;
        }
        return result;
    }
}
