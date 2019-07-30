package RegularExpressions;

import java.util.*;

public class chernova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> racers = new LinkedHashMap<>();
        List<String> forPrint = new ArrayList<>();


        //Вкарване на сплитнат масив в Мап
        String[] participants = scanner.nextLine().split(", ");
        for (int i = 0; i < participants.length; i++) {
            racers.put(participants[i], 0);
        }
        racers.put("George",42);

        System.out.println(racers.get("George"));


    }
}