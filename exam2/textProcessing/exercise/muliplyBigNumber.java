package textProcessing.exercise;

        import java.math.BigInteger;
        import java.util.Scanner;

public class muliplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInt = new BigInteger(scanner.nextLine());
        BigInteger num = new BigInteger(scanner.nextLine());
        BigInteger result = bigInt.multiply(num);
        System.out.println(result);

    }
}
