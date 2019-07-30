package methods.methodsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class arrayManupulator2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = reader.readLine();

        while (!command.equals("end")) {

            String[] cmdArgs = command.split(" ");

            if (cmdArgs[0].equals("exchange")) {
                int index = Integer.parseInt(cmdArgs[1]);
                if (index >= 0 && index < number.length) {
                    exchange(number, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (cmdArgs[0].equals("max")) {
                if (cmdArgs[1].equals("even")) {
                    int index = findEvenIndex(number);
                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");

                    }
                } else {
                    int index = findOddIndex(number);
                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");

                    }

                }
            } else if (cmdArgs[0].equals("min")) {
                if (cmdArgs[1].equals("even")) {
                    int index = findMinEvenIndex(number);
                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");

                    }
                } else {
                    int index = findMinOddIndex(number);
                    if (index != -1) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");

                    }

                }
            } else if (cmdArgs[0].equals("first")) {
                int count = Integer.parseInt(cmdArgs[1]);
                if (cmdArgs[2].equals("even")) {
                    if (count <= number.length) {
                        printFirstEven(number, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                } else {
                    int oddCount = Integer.parseInt(cmdArgs[1]);
                    if (oddCount <= number.length) {
                        printFirstOdd(number, count);
                    } else {
                        System.out.println("Invalid count");
                    }


                }
            } else if (cmdArgs[0].equals("last")) {
                int count = Integer.parseInt(cmdArgs[1]);
                if (cmdArgs[2].equals("even")) {
                    if (count <= number.length) {
                        printLastEven(number, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                } else {
                    int oddCount = Integer.parseInt(cmdArgs[1]);
                    if (oddCount <= number.length) {
                        printLastOdd(number, count);
                    } else {
                        System.out.println("Invalid count");
                    }


                }
            }

            command = reader.readLine();

        }
        printArray(number);
    }

    private static void printLastEven(int[] number, int count) {
        int[] arr = new int[number.length];
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] % 2 == 0 && count > 0) {
                count--;
                arr[i] = number[i];
            } else {
                arr[i] = -1;
            }

        }
        printArray(arr);


    }
    private static void printLastOdd(int[] number, int count) {
        int[] arr = new int[number.length];
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] % 2 != 0 && count > 0) {
                count--;
                arr[i] = number[i];
            } else {
                arr[i] = -1;
            }

        }
        printArray(arr);


    }

    private static void printFirstOdd(int[] number, int count) {
        int[] arr = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0 && count > 0) {
                count--;
                arr[i] = number[i];
            } else {
                arr[i] = -1;
            }

        }
        printArray(arr);


    }

    private static void printFirstEven(int[] number, int count) {
        int[] arr = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0 && count > 0) {
                count--;
                arr[i] = number[i];
            } else {
                arr[i] = -1;
            }

        }
        printArray(arr);
    }

    private static int findMinOddIndex(int[] number) {
        int index = -1;

        int maxNum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (maxNum >= number[i] && number[i] % 2 != 0) {
                maxNum = number[i];
                index = i;

            }

        }

        return index;
    }

    private static int findMinEvenIndex(int[] number) {
        int index = -1;

        int maxNum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (maxNum >= number[i] && number[i] % 2 == 0) {
                maxNum = number[i];
                index = i;

            }

        }

        return index;
    }

    private static int findOddIndex(int[] number) {
        int index = -1;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (maxNum <= number[i] && number[i] % 2 != 0) {
                maxNum = number[i];
                index = i;

            }

        }

        return index;

    }

    private static int findEvenIndex(int[] number) {
        int index = -1;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (maxNum <= number[i] && number[i] % 2 == 0) {
                maxNum = number[i];
                index = i;

            }

        }

        return index;
    }

    private static void printArray(int[] number) {
        System.out.print("[");
        boolean printFirst = true;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != -1) {
                if (printFirst) {

                    System.out.print(number[i]);
                    printFirst = false;
                } else {
                    System.out.print(", " + number[i]);
                }
            }
        }
        System.out.println("]");
    }

    private static void exchange(int[] number, int index) {

        int[] firstSide = new int[index + 1];
        int[] secondSide = new int[number.length - (index + 1)];

        for (int i = 0; i <= index; i++) {
            firstSide[i] = number[i];

        }

        for (int i = index + 1; i < number.length; i++) {
            secondSide[i - (index + 1)] = number[i];

        }

        for (int i = 0; i < secondSide.length; i++) {
            number[i] = secondSide[i];

        }

        for (int i = 0; i < firstSide.length; i++) {
            number[i + secondSide.length] = firstSide[i];

        }
    }
}