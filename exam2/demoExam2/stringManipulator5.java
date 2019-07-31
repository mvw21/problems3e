package demoExam2;



import java.util.Scanner;

public class stringManipulator5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String result = "";
        while (!"End".equals(command)) {
            String[] elements = command.split("\\s+");
            switch (elements[0]) {
                case "Add":
                    result += elements[1];
                    break;
                case "Upgrade":
                    String ch1 = elements[1];
                    String newResult = "";
                    for (int i = 0; i < result.length(); i++) {
                        if (String.valueOf(result.charAt(i)).equals(ch1)) {
                            newResult += (char) (result.charAt(i) + 1);
                        } else {
                            newResult += String.valueOf(result.charAt(i));
                        }
                    }
                    result = newResult;
                    break;
                case "Print":
                    System.out.println(result);
                    break;
                case "Index":
                    String ch2 = elements[1];
                    boolean isIndexFound = false;
                    int index = result.indexOf(ch2);
                    while (index != -1) {
                        System.out.print(index + " ");
                        index = result.indexOf(ch2, index + 1);
                        isIndexFound = true;
                    }
                    if (isIndexFound) {
                        System.out.println();
                    }
                    if (!isIndexFound) {
                        System.out.println("None");
                    }
                    break;
                case "Remove":
                    String ch3 = elements[1];
                    result = result.replace(ch3,"");
                    break;
            }

            command = scanner.nextLine();
        }
    }
}