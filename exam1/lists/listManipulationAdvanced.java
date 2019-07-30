package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")) {
            String[] command1 = command.split(" ");
            String part1 = command1[0];
            String part2 = command1[1];

            if (part1.equalsIgnoreCase("Contains")) {
                int part2Num = Integer.parseInt(part2);
                if (nums.contains(part2Num)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (part1.equalsIgnoreCase("Print")) {
                if (part2.equalsIgnoreCase("even")) {

                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) % 2 == 0) {
                            System.out.print(nums.get(i) + " ");

                        }

                    }
                    System.out.println();
                } else {
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) % 2 != 0) {
                            System.out.print(nums.get(i) + " ");
                        }

                    }
                    System.out.println();

                }
            } else if (part1.equalsIgnoreCase("Get")) {
                int sum = 0;
                for (int i = 0; i < nums.size(); i++) {
                    sum += nums.get(i);
                }
                System.out.println(sum);

            } else if (part1.equalsIgnoreCase("Filter")) {
                int part3 = Integer.parseInt(command1[2]);
                if (part2.equalsIgnoreCase(">")) {
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) > part3) {
                            System.out.print(nums.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (part2.equalsIgnoreCase("<")) {
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) < part3) {
                            System.out.print(nums.get(i) + " ");
                        }
                    }
                    System.out.println();

                } else if (part2.equalsIgnoreCase(">=")) {
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) >= part3) {
                            System.out.print(nums.get(i)+" ");
                        }
                    }
                    System.out.println();
                } else if (part2.equalsIgnoreCase("<=")) {
                    for (int i = 0; i < nums.size(); i++) {
                        if (nums.get(i) <= part3) {
                            System.out.print(nums.get(i)+" ");
                        }
                    }
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }
    }

}