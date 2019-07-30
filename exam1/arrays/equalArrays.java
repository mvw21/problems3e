package arrays;

import java.util.Scanner;

public class equalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");
        boolean areIdenticals = true;
        int counterIndex = 0;
        int sum = 0;
        boolean finished = false;
        for (int i = 0; i <firstInput.length ; i++) {
            if(finished){
                break;
            }
            String current = firstInput[i];
            int num = Integer.parseInt(current);
            for (int j = i; j<=i ; j++) {
                String current1 = secondInput[j];
                int num1 = Integer.parseInt(current1);
                if(!current.equalsIgnoreCase(current1)){
                    areIdenticals=false;
                    counterIndex = i;
                    finished = true;
                    break;
                }

            }
            sum += num;

        }
        if(!areIdenticals)
        System.out.printf("Arrays are not identical. Found difference at %d index.",counterIndex);
        else
            System.out.printf("Arrays are identical. Sum: %d",sum);
}
}
