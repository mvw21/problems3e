package lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ladybugsChernova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        List<Integer> ladybugsIndexes = new ArrayList<>();

        for (int i = 0; i <fieldSize ; i++) {
            int j = 0;
            ladybugsIndexes.add(j);
        }

        String positions = scanner.nextLine();
        String[] positions1 = positions.split("\\s+");


        for (int i = 0; i < positions1.length; i++) {
            ladybugsIndexes.set(Integer.parseInt(positions1[i]),1);

        }

        String command = scanner.nextLine();

        while(!command.equalsIgnoreCase("end")){
            String[] tokens = command.split("\\s+");
            int part1 = Integer.parseInt(tokens[0]);
            String part2 = tokens[1];
            int part3 = Integer.parseInt(tokens[2]);


                if(part2.equalsIgnoreCase("right")){
                    if(part1>=0 && part3>0) {
                        int counter = 0;
                        int partX = part3 + part1;
                        while (counter < ladybugsIndexes.size()) {  //mai e -1
                            if (partX < fieldSize) {
                                if (ladybugsIndexes.get(partX) == 0) {
                                    ladybugsIndexes.set(partX, 1);
                                    ladybugsIndexes.set(part1, 0);
                                } else {

                                    partX++;
                                }


                            } else {
                                ladybugsIndexes.set(part1, 0);
                            }

                            counter++;

                        }
                    }
                }else {
                    if(part1<=fieldSize-1  && part1-part3>=0 && part1>=0 && ladybugsIndexes
                            .get(part1)!=0){


                        int counter = 0;
                        int partY = part1-part3;


                            for (int i = partY; i >=0 ; i--) {
                                if(ladybugsIndexes.get(part1-part3)==0){
                                    ladybugsIndexes.set(part1-part3,1);
                                    ladybugsIndexes.set(part1,0);
                                    break;
                                }
                                i--;
                                if(i<0){
                                    ladybugsIndexes.set(part1,0);
                                    break;
                                }
                            }



                    }
                    if(part1<=fieldSize-1){
                       if(part1-part3<0){
                           ladybugsIndexes.set(part1,0);
                       }
                    }


                }


            command = scanner.nextLine();

        }

        for (int i = 0; i <ladybugsIndexes.size() ; i++) {
            int n = ladybugsIndexes.get(i) ;
            System.out.print(n+" ");
        }
    }
}
