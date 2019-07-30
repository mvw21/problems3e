package lists.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while(!command.equalsIgnoreCase("end")){
            String[] command1 = command.split("\\s+");
            String part1 = command1[0];

            if(part1.equalsIgnoreCase("Change")){
                String part2  = command1[1];
                String part3  = command1[2];

                int index = input.indexOf(part2);
                if(index>=0 && index<input.size()){
                    input.set(index,part3);
                }



            }else if(part1.equalsIgnoreCase("Hide")){
                String part2 = command1[1];
                int index = input.indexOf(part2);
                if(index>=0 && index<input.size()){
                    input.remove(index);
                }

            }else if(part1.equalsIgnoreCase("Switch")){
                String part2 = command1[1];
                String part3 = command1[2];



                if(input.contains(part2) && input.contains(part3)){
                    int indexPart2 = input.indexOf(part2);
                    int indexPart3 = input.indexOf(part3);

                    input.set(indexPart2,part3);
                    input.set(indexPart3, part2);
                }

            }else if(part1.equalsIgnoreCase("Insert")){

                int index = Integer.parseInt(command1[1]);
                String part3 = command1[2];

                if(index>=0 && index<input.size()){
                    input.add(index+1,part3);
                }

            }else if(part1.equalsIgnoreCase("Reverse")){
                Collections.reverse(input);
            }

            command = scanner.nextLine();
        }

        for(String n : input){
            System.out.print(n+" ");
        }
    }
}
