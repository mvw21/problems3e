package AsociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



import java.text.DecimalFormat;
        import java.util.*;

public class countCharsInAString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("");


        Map<Character,Integer> texts = new LinkedHashMap<>();

        for (String s : line) {
            char charFromString = s.charAt(0);
            if(charFromString != ' '){

                if (texts.containsKey(charFromString)) {
                    texts.put(charFromString, texts.get(charFromString) + 1);
                } else {
                    texts.put(charFromString, 1);
                }

            }

        }

        for(Map.Entry<Character, Integer>entry : texts.entrySet()){
//            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());

        }

    }

}



