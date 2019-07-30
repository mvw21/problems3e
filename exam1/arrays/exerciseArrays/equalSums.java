package arrays.exerciseArrays;

import java.util.Scanner;

public class equalSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int[] numbers = new int[line.length];
        boolean indexExist = false;

        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i <line.length ; i++) {
            if(line.length==1){
                System.out.println(0);

                break;
            }
            int leftSum = 0;


            for (int j = i-1; j >= 0  ; j--) {
                leftSum+= numbers[j];
            }
            int rightSum = 0;
            for (int j = i+1; j < numbers.length ; j++) {
                rightSum+= numbers[j];
            }

            if(leftSum==rightSum){
                indexExist=true;
                System.out.println(i);
            }
        }
        if(!indexExist && (line.length!=1)){
            System.out.println("no");
        }

    }
}