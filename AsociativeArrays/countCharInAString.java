package AsociativeArrays;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class countCharInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split("");

        Map<String, Integer> counts = new LinkedHashMap<>();


        for(String num : nums){
            if(!num.equalsIgnoreCase(" ")){
                if(!counts.containsKey(num)){
                    counts.put(num,0);
                }
                counts.put(num,counts.get(num)+1);
            }


        }




        for(Map.Entry<String, Integer>entry : counts.entrySet()){

            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());

        }
    }

    }




