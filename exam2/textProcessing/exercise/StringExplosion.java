package textProcessing.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("");
        // Как се прави адване .addАll на масив в празен лист:
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(line));

        int addedPower = 0;
        for (int i = 0; i < line.length ; i++) {
            char currentChar = line[i].charAt(0);

            if(currentChar == (char)62){
                int power = Integer.parseInt(line[i+1]);

                //проверка дали имам Power ot преди да натрупвам.
                int counter = 0;
                for (int j = i+1; j < i+1+power; j++) {
                    int index = Integer.parseInt(result.get(j));
                    System.out.println(index);
                    result.set(index,"");


//                    if(!line[i+1].equalsIgnoreCase(">")){
//                        result.remove(result.get(i+1));
//                        counter++;
//                    }else{
//                        addedPower+= (power-counter);
//                        break;
//                    }


                }
            }
        }
    }

}
