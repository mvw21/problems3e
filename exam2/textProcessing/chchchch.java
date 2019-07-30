package textProcessing;

import java.util.*;

public class chchchch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line1 = line.split("");

        List <String> result = new ArrayList<>();
        result.addAll(Arrays.asList(line1));

        List<String> novList = new ArrayList<>();

        int powerBonus = 0;

        for (int i = 0; i < line.length() ; i++) {
            char current = line.charAt(i);



            if(current == '>'){
               i++;

                int counter = 0;
               int power = line.charAt(i) - '0';

               power+=powerBonus;

               int m = i;

                for (int j = i; j < m + power ; j++) {
                    if(line.charAt(j) != '>'){
                        counter++;
                        result.set(j,"*");
                    }else{
                        powerBonus+= power-counter;

                        break;
                    }

                }

            }

        }

        for(String s : result){
            if(!s.equalsIgnoreCase("*")){
                System.out.print(s);
            }
        }


    }
}
