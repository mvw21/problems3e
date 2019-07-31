package demoExam2;


import java.util.Scanner;

public class stringManipulator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        StringBuilder myString = new StringBuilder();

        while (!command.equals("End")) {
            command = scanner.nextLine();
            String[] commands = command.split(" ");
            String com1 = commands[0];

            switch (com1) {
                case "Add":
                    String com2 = commands[1];
                    myString.append(com2);
                    break;
                case "Upgrade":
                    com2 = commands[1];
                    StringBuilder newString = new StringBuilder();
                    for (int i = 0; i < myString.length(); i++) {
                        if (String.valueOf(myString.charAt(i)).equals(com2)) {
                            newString.append((char) (myString.charAt(i) + 1));
                        } else {
                            newString.append((char) (myString.charAt(i)));
                        }
                    }
                    myString = newString;
                    break;
                case "Print":
                    System.out.println(myString);
                    break;
                case "Index":
                    com2 = commands[1];
                    boolean isFound = false;
                    int index = myString.indexOf(com2);
                    while (index != -1) {
                        System.out.print(index + " ");
                        index = myString.indexOf(com2, index + 1);
                        isFound = true;
                    }
                    if (isFound) {
                        System.out.println();
                    }
                    if (!isFound) {
                        System.out.println("None");
                    }
                    break;
                case "Remove":
                    com2 = commands[1];
                    String newOne = myString.toString();
                    newOne = newOne.replaceAll(com2, "");
                    myString = new StringBuilder();
                    myString.append(newOne);
                    break;
            }
        }
    }
}