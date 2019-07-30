package methods;

import java.util.Scanner;

public class printingTriangle {
    public static void printingTriangle(int n) {
        for (int i = 1; i <=n ; i++) {
            print(1,i);
        }
        for (int i = n-1; i >=1 ; i--) {
            print(1,i);
        }
    }
    public static void print(int start,int end) {
        for (int i = start; i <=end ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printingTriangle(Integer.parseInt(scanner.nextLine()));


    }
}
