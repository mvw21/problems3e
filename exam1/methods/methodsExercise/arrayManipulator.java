package methods.methodsExercise;

import java.util.Scanner;

public class arrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        String command = scanner.nextLine();
        int[] lineArray = new int[line.length];


        for (int i = 0; i <line.length ; i++) {
            int n = Integer.parseInt(line[i]);
            lineArray[i] = n;
        }

        String result2 = "";

        while(!command.equalsIgnoreCase("end")){
           String[] commandSplit = command.split(" ");
            String firstPart = commandSplit[0];
            String secondPart = commandSplit[1];

            if(firstPart.equalsIgnoreCase("exchange")){
                int index = Integer.parseInt(commandSplit[1]);

                String result = "";
                if(index>=0 && index< line.length){
                    String[] leftArray = new String[index+1];
                    for (int i = 0; i <= index ; i++) {
                        String num = Integer.toString(lineArray[i]);
                        leftArray[i]= num;
                }

                    String[] rightArray = new String[line.length-index-1];
                    int counter = 0;
                    for (int i = index+1; i <line.length ; i++) {
                        String num1 = Integer.toString(lineArray[i]);

                        rightArray[counter] = num1;
                        counter++;
                    }

                    for (int i = 0; i <rightArray.length ; i++) {

                           result+=rightArray[i]+", ";
                    }
                    for (int i = 0; i <leftArray.length ; i++) {
                        if(i==leftArray.length-1){
                            result+=leftArray[i];
                        }else{
                        result+=leftArray[i]+", ";
                        }
                        }
                    }
                    String line1 = result.replaceAll(",","");
                    String[] line2 = line1.split(" ");
                for (int i = 0; i < line2.length ; i++) {
                    int num = Integer.parseInt(line2[i]);
                    lineArray[i] = num;
                }
                    result2 = result;

                    }else if(firstPart.equalsIgnoreCase("max")){
                        if(secondPart.equalsIgnoreCase("odd")){
                            int maxOddIndex = 0;
                            int maxOddNum=0;
                            int counter = 0;

                            for (int i = 0; i <lineArray.length ; i++) {
                                int maxOddCheck = lineArray[i];
                                if(maxOddCheck%2!=0){
                                    if(maxOddCheck>maxOddNum){
                                        maxOddNum=maxOddCheck;
                                        maxOddIndex = i;
                                        counter++;
                                    }
                                }
                            }
                            if(counter==0){
                                System.out.println("No matches");
                            }
                            System.out.println(maxOddIndex);
                        }else{
                            int maxEvenIndex = 0;
                            int maxEvenNum = 0;
                            int counter = 0;
                            for (int i = 0; i <lineArray.length ; i++) {
                                int maxEvenCheck = lineArray[i];
                                if(maxEvenCheck%2==0){
                                    if(maxEvenCheck>maxEvenNum){
                                        maxEvenNum=maxEvenCheck;
                                        maxEvenIndex=i;
                                        counter++;
                                    }

                                    System.out.println(maxEvenIndex);
                                }
                            }
                            if(counter==0){
                                System.out.println("No matches");
                            }
                        }


            }else if(firstPart.equalsIgnoreCase("min")){

                if(secondPart.equalsIgnoreCase("odd")){
                    int minOddIndex = 0;
                    int minOddNum=0;
                    int counter = 0;

                    for (int i = 0; i <lineArray.length ; i++) {
                        int minOddCheck = lineArray[i];
                        if(minOddCheck%2!=0){
                            if(minOddCheck<minOddNum){
                                minOddNum=minOddCheck;
                                minOddIndex = i;
                                counter++;
                            }
                        }
                    }
                    if(counter==0){
                        System.out.println("No matches");
                    }
                    System.out.println(minOddIndex);
                }else{
                    int minEvenIndex = 0;
                    int minEvenNum = 100;
                    int counter = 0;
                    for (int i = 0; i <lineArray.length ; i++) {
                        int minEvenCheck = lineArray[i];
                        if(minEvenCheck%2==0){
                            if(minEvenCheck<minEvenNum){
                                minEvenNum=minEvenCheck;
                                minEvenIndex=i;
                                counter++;
                            }


                        }
                    }
                    if(counter==0){
                        System.out.println("No matches");
                    }else{
                        System.out.println(minEvenIndex);
                    }
                }

            }else if(firstPart.equalsIgnoreCase("first")){
                    continue;
            }else if(firstPart.equalsIgnoreCase("last")){
                continue;
            }
            command = scanner.nextLine();
                }
                     System.out.print(result2);

            }


        }



