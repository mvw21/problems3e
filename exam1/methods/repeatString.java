package methods;

import java.util.Scanner;

public class repeatString {
   private static String repeatString(String str, int count){
       String result = "";
       for (int i = 0; i < count; i++) {
           result+=str;
       }
       return result;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String result1 = repeatString(str,count);
        System.out.println(result1);

           }
}
