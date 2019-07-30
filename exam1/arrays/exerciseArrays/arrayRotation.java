package arrays.exerciseArrays;

        import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputElements = scanner.nextLine().split(" ");

        int[] number = new int[inputElements.length];

        for (int i = 0; i < inputElements.length; i++) {
            number[i] = Integer.parseInt(inputElements[i]);

        }

        int rotations = Integer.parseInt(scanner.nextLine());
//        rotations = rotations % number.length; deistva i s toz i bez toz red.

        for (int i = 0; i < rotations; i++) {
            int firstElement = number[0];

            for (int index = 0; index < number.length-1; index++) {
                number[index] = number[index+1];
            }

            number[number.length-1] = firstElement;        }


        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }
    }
}
