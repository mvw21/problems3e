package methods;

import java.util.Scanner;

public class method1 {
    public static void printSign(int num){
        if(num>0){
            System.out.printf("The number %d is positive.",num);
        }else if(num<0){
            System.out.printf("The number %d is negative.",num);
        }else{
            System.out.printf("The number %d is zero.",num);
        }

        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printSign(Integer.parseInt(scanner.nextLine()));


    }


}


