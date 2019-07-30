package lists.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        String line = scanner.nextLine();

        while (!line.equalsIgnoreCase("end")) {

            String[] tokens = line.split("\\s+");
            if (tokens[0].equalsIgnoreCase("add")) {
                numbers.add(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equalsIgnoreCase("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, Integer.parseInt(tokens[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equalsIgnoreCase("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equalsIgnoreCase("shift")) {
                int count = Integer.parseInt(tokens[2]);

//                count = count % numbers.size();
                if (tokens[1].equalsIgnoreCase("left")) {
                    for (int i = 0; i < count; i++) {
                        numbers.add(numbers.get(0));
                        numbers.remove(0);
                    }
                } else {
                    for (int i = 0; i < count; i++) {
                        numbers.add(0, numbers.get(numbers.size() - 1));
                        numbers.remove(numbers.size() - 1);
                    }
                }
            }
            line = scanner.nextLine();
        }
        for(int n : numbers){
            System.out.print(n+" ");
        }



    }
}



//        ArrayList<Integer> line = Arrays.stream(scanner.nextLine().split(" +"))
//                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
//
////        List<Integer> line = Arrays.stream(scanner.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());
//
//        String command = scanner.nextLine();
//
//        while (!command.equalsIgnoreCase("end")) {
//            String[] command1 = command.split(" +");
//            String firstPart = command1[0];
//            if (command.contains("Insert")) {
//                int num = Integer.parseInt(command1[1]);
//                int num2 = Integer.parseInt(command1[2]);
//                if (num2 >= 0 && num2 < line.size()) {
//                    line.add(num2, num);
//                } else {
//                    System.out.println("Invalid index");
//                }
//
//            } else if (command.contains("Remove")) {
//
//                int num = Integer.parseInt(command1[1]);
//                if (num >= 0 && num < line.size()) {
//                    line.remove(num);
//
//                } else {
//                    System.out.println("Invalid index");
//                }
//            } else if (command.contains("Shift")) {
//                int num3 = Integer.parseInt(command1[2]);
//                if (num3 >= 0 && num3 < line.size()) {
//
//                    if (command.contains("right")) {
//                        for (int i = 0; i < num3; i++) {
//                            line.add(0, line.get(line.size() - 1));
//                            line.remove(line.size()-1);
//                        }
//                    } else {
//
//                        for (int i = 0; i < num3; i++) {
//                            int newNum = line.get(0);
//                            line.add(newNum);
//                            line.remove(0);
//                        }
//                    }
//                } else {
//                    System.out.println("Invalid index");
//                }
//            } else if (command.contains("Add")) {
//                int num = Integer.parseInt(command1[1]);
//                line.add(num);
//
//            }
//            command = scanner.nextLine();
//        }
//        for (int n : line) {
//            System.out.print(n + " ");
//        }
//    }
//
//}