package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

       String command = scanner.nextLine();
        while(!command.equals("end")){
            String[] command1 = command.split(" ");
            String commandA = command1[0];
            int commandB = Integer.parseInt(command1[1]);
            if(commandA.equalsIgnoreCase("Add")){
                nums.add(commandB);
            }else if(commandA.equalsIgnoreCase("Remove")){
                nums.remove(Integer.valueOf(commandB));
            }else if(commandA.equalsIgnoreCase("RemoveAt")){
                nums.remove(commandB);
            }else if(commandA.equalsIgnoreCase("Insert")){
                int b = Integer.parseInt(command1[2]);
                nums.add(b,commandB);
            }
            command = scanner.nextLine();
        }
        for(int n : nums){
            System.out.print(n+" ");
        }
    }
}
