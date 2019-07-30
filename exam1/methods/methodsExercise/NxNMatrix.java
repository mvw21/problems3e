package methods.methodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(sequence(num));
    }
    public static String sequence(int num){
       String print = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j++) {
                print+=num+" ";
            }
             print+="\n";
        }
        return print;
    }
}
