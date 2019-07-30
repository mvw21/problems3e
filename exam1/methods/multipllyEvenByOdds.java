package methods;



import java.util.Scanner;

public class multipllyEvenByOdds {
    private static int getOddSum(int n){
        int oddSum = 0;
        String nn = Integer.toString(n);
        String[] nnn = nn.split("");
        for (int i = 0; i <nnn.length ; i++) {
            int num3 = Integer.parseInt(nnn[i]);
            if(i%2==0){
                oddSum+=num3;
            }
        }

        return oddSum;
    }
    private static int getEvenSum(int n){
        int evensSum = 0;
        String nn = Integer.toString(n);
        String[] nnn = nn.split("");

        for (int i = 0; i <nnn.length ; i++) {
            int num3 = Integer.parseInt(nnn[i]);
            if((i+1)%2==0){
                evensSum+=num3;
            }
        }
        return evensSum;
    }
    private static int getMultipleOfEvenAndOdds(int n){
        int evenSum = getMultipleOfEvenAndOdds(n);
        int oddSum = getMultipleOfEvenAndOdds(n);
        
        return evenSum*oddSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvenAndOdds(n));


    }

    }





