package arrays;

        import java.util.Arrays;
        import java.util.Scanner;

public class reverseAsArrayOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        for (int i = string.length-1;i >=0 ;i--) {
            String currentString = string[i];
            System.out.print(currentString+ " ");
        }


    }
}
