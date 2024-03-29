package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class race2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> racers = new LinkedHashMap<>();
        List<String> forPrint = new ArrayList<>();

        String[] participants = scanner.nextLine().split(", ");

        for (int i = 0; i < participants.length ; i++) {
            racers.put(participants[i],0);
        }

        String command = scanner.nextLine();
        while(!command.equalsIgnoreCase("end of race")){
            String regex = "[A-Z]*[a-z]*";
            Pattern pattern1 = Pattern.compile(regex);
            Matcher matcher1 = pattern1.matcher(command);
            String name = "";

            while(matcher1.find()){
                name+= matcher1.group();

            }

            if(racers.containsKey(name)){
                String regEx = "\\d";
                Pattern pattern2 = Pattern.compile(regEx);
                Matcher matcher2 = pattern2.matcher(command);
                int sum = 0;
                while(matcher2.find()){
                    sum+= Integer.parseInt(matcher2.group());
                }
                if(racers.get(name) == 0){
                    racers.put(name,sum);
                }else{
                    sum = racers.get(name) + sum;
                    racers.put(name,sum);
                }

            }
            command = scanner.nextLine();
        }
        racers.entrySet().stream().sorted((f,s) -> s.getValue().compareTo(f.getValue())).limit(3).forEach(e->{
            forPrint.add(e.getKey());
        });

        System.out.printf("1st place: %s%n",forPrint.get(0));
        System.out.printf("2nd place: %s%n",forPrint.get(1));
        System.out.printf("3rd place: %s%n",forPrint.get(2));
    }
}
