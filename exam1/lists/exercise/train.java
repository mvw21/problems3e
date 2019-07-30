package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equalsIgnoreCase("end")){
            String[] command1 = command.split(" ");
            String command2 = command1[0];



            if(command2.equalsIgnoreCase("add")){
                int num1 = Integer.parseInt(command1[1]);
                line.add(num1);
            }else{

                int num2 = Integer.parseInt(command2);
                for (int i = 0; i <line.size() ; i++) {
                    if(num2+line.get(i)<=capacity){
                        line.set(i,num2+line.get(i));
                        break;
                    }
                }
            }
            command=scanner.nextLine();
        }
        for(int n : line){
            System.out.print(n+" ");
        }
    }
}
