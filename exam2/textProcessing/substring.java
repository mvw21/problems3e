package textProcessing;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String phrase = scanner.nextLine();

        while(phrase.contains(key)){
            phrase = phrase.replace(key,"");
//            phrase = phrase.replaceAll(key,"");

        }
        System.out.println(phrase);
    }
}



//    replaceAll(key,"");