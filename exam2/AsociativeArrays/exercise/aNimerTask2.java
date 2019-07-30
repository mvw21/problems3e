package AsociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


import java.text.DecimalFormat;
        import java.util.*;

public class aNimerTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String,Integer> menu = new LinkedHashMap<>();

        while(!line.equalsIgnoreCase("Stop")){
            String resource = line;
            int value = Integer.parseInt(scanner.nextLine());

            if(!menu.containsKey(resource)){
                menu.put(resource,0);
            }
            menu.put(resource,menu.get(resource)+value);

            line = scanner.nextLine();
        }

        for(Map.Entry<String,Integer>entry : menu.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }

    }

}



