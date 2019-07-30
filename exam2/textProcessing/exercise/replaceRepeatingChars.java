package textProcessing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<Character> line1 = new ArrayList<>();
        char lastChar= (char)0;
        for (int i = 0; i <=line.length()-1 ; i++) {

            char n = line.charAt(i);



            if(line.charAt(i)!=lastChar ){
                line1.add(line.charAt(i));

        }

            lastChar = line.charAt(i);
        }

        for(char z : line1){
            System.out.print(z);
        }
    }
}


//По лесно решение :
//
//public class chernovaAaA {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String line = scanner.nextLine();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < line.length(); i++) {
//            if(i==0){
//                sb.append(line.charAt(i));
//                continue;
//            }
//            if(line.charAt(i)!=line.charAt(i-1)){
//                sb.append(line.charAt(i));
//            }
//        }
//
//        System.out.print(sb);
//
//
//    }
//}
