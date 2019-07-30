package RegularExpressions;


        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> racers = new LinkedHashMap<>();
        List<String> forPrint = new ArrayList<>();


        //Вкарване на сплитнат масив в Мап
        String [] participants = scanner.nextLine().split(", ");
        for (int i = 0; i < participants.length; i++) {
            racers.put(participants[i],0);
        }

        String info = scanner.nextLine();
        while (!info.equals("end of race")){
            //Това бейсикли е проверка дали isALetter
            String regex = "[A-Z]*[a-z]*";
            Pattern pattern1  = Pattern.compile(regex);
            Matcher matcher1 = pattern1.matcher(info);
            String name = "";
            while (matcher1.find()){
                name += matcher1.group();
            }
            if(racers.containsKey(name)){
                //Това бейсикли е проверка дали isAdigit
                String regEx = "\\d";
                Pattern pattern2 = Pattern.compile(regEx);
                Matcher matcher2 = pattern2.matcher(info);
                int sum = 0;
                while (matcher2.find()){
                    sum += Integer.parseInt(matcher2.group());

                }
                if(racers.get(name) == 0){
                    racers.put(name,sum);
                }else{
                    sum = racers.get(name) + sum;
                    racers.put(name,sum);
                }
            }

            info = scanner.nextLine();
        }
        racers.entrySet().stream().sorted((f,s) -> s.getValue().compareTo(f.getValue())).limit(3).forEach(e->{
            forPrint.add(e.getKey());
        });

        System.out.printf("1st place: %s%n",forPrint.get(0));
        System.out.printf("2nd place: %s%n",forPrint.get(1));
        System.out.printf("3rd place: %s%n",forPrint.get(2));
    }
}