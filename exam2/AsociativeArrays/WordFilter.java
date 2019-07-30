package AsociativeArrays;
import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] line = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        for(String n : line){
            System.out.println(n+" ");
        }
    }
}








