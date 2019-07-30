package lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class chernova01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//
//        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
//                .collect(Collectors.toList());
//
//       while(!line.equalsIgnoreCase("end")){
//           String[] word = line.split(" ");
//           String word1 = word[0];
//           String word2 = word[1];
//            List<String> donde = new ArrayList<>();
//
//       }
        int n = Integer.parseInt(scanner.nextLine());
    forfor(n);

    }
    public static void printH(String line){
        String hello = "Hello "+ line;
        System.out.println(hello);
    }

    public static void forfor(int n) {
        for (int i = 1; i <n ; i++) {
            System.out.println(i);
        }
    }
}
