package arrays.exerciseArrays;

import java.util.Scanner;

public class commonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i <firstArray.length ; i++) {
            String string1 = firstArray[i];
            for (int j = 0; j < secondArray.length; j++) {
                String string2 = secondArray[j];
                if(string2.equals(string1)){
                    System.out.print(string2+" ");
                }
            }

        }

       /* String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int index = 0; index < secondArray.length ; index++) {
            String currentElement = secondArray[index];
            for (int i = 0; i < firstArray.length ; i++) {
                String comparerElement = firstArray[i];
                if(currentElement.equals(comparerElement)){
                    System.out.print(currentElement + " ");
                }
            }
        }*/

    }
}