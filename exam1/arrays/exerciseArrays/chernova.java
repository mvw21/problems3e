package arrays.exerciseArrays;

        import java.util.Scanner;

public class chernova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        String[] bugIndexes = scanner.nextLine().split(" ");

        for(String index : bugIndexes) {
            int i = Integer.parseInt(index);
            if (i >= 0 && i < field.length) {
                field[i] = 1;
            }
        }

            String input = scanner.nextLine();

            while(!input.equalsIgnoreCase("end")){
                String[] tokens = input.split(" ");
                int index1 = Integer.parseInt(tokens[0]);
                int flyLength = Integer.parseInt(tokens[2]);
                String direction = tokens[1];

                if(index1>=0 && index1<field.length && field[index1]==1){
                    field[index1] = 0;
                    if(direction.equalsIgnoreCase("right")){
                        index1+=flyLength;
                        while(index1>=0 && index1<field.length && field[index1] ==1){
                            index1+=flyLength;

                        }
                        if(index1 < field.length){
                            field[index1]=1;   //!
                        }
                    }else{
                        index1-=flyLength;
                        while(index1>=0 && field[index1] ==1){
                            index1-=flyLength;
                        }
                        if(index1>=0){
                            field[index1]=1;
                        }
                    }
                }
                input = scanner.nextLine();
            }

                for(int j : field){
                    System.out.print(j+" ");
                }
        }


    }

