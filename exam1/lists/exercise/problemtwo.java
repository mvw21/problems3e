package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problemtwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while(!command.equalsIgnoreCase("No Money")){

            String[] command1 = command.split("\\s+");
            String firstPart = command1[0];
            String part2 = command1[1];
            if(firstPart.equalsIgnoreCase("OutOfStock")){
                while(input.contains(part2)){
                    int index = input.indexOf(part2);

                    input.set(index,"None");

                }

            }else if(firstPart.equalsIgnoreCase("Required")){
                int part3 = Integer.parseInt(command1[2]);
                if(part3>=0 && part3 <input.size()){   //moje i da e -1
                    input.set(part3,part2);
                }

            }else if(firstPart.equalsIgnoreCase("JustInCase")){
                    input.remove(input.size()-1);
                    input.add(part2);
            }




            command = scanner.nextLine();
        }
        String nn = "None";
        while(input.contains(nn)){
            int indexnum = input.indexOf(nn);
            input.remove(indexnum);
        }

        for(String n : input){
            System.out.print(n+ " ");
        }

    }
}
