package demoExam2;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class stringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String line = "";

        while(!command.equalsIgnoreCase("end")){

            if(command.equalsIgnoreCase("Print")){
                System.out.println(line);
                command=scanner.nextLine();
                continue;  //da go vidq
            }

            String[] splitLine = command.split("\\s+");
            String firstPart = splitLine[0];
            String secondPart = splitLine[1];

            if(firstPart.equalsIgnoreCase("Add")){
                line+= secondPart;

            }else if(firstPart.equalsIgnoreCase("Index")){
//               Index b primerno namirash v line
                List<Integer> indexes = new ArrayList<>();
                int counter = 0;
                for (int i = 0; i < line.length() ; i++) {
                    //da proverq kakvo stava ako v cikal imash int list primerno i posle pak dali overriteva predniq ili crushva
                    char part2Char = splitLine[1].charAt(0);
                    char newChar = line.charAt(i);
                    if(newChar == part2Char){
                        indexes.add(i);
                        counter++;
                    }

                }
                if(counter==0){
                    System.out.println("None");
                }else{
                    for(int n : indexes){
                        System.out.print(n+" ");
                    }
                }
                System.out.println();

            }else if(firstPart.equalsIgnoreCase("Upgrade")){
//               o	Find all occurences of {char} and replace it with its ASCII code plus one.
                String emptyLine = "";
                char part2Char = splitLine[1].charAt(0);
                int newChar = 0 ;
                List<Character> charss = new ArrayList<>();
                for (int i = 0; i < line.length() ; i++) {
                    if(line.charAt(i)==part2Char){
                        newChar = part2Char+1;
                        char newestChar = (char)newChar;
                        charss.add(newestChar);

                    }else{
                        charss.add(line.charAt(i));
                    }
                }

                for (int i = 0; i < charss.size(); i++) {
                    emptyLine += charss.get(i);
                }
                line = emptyLine;

            }else if(firstPart.equalsIgnoreCase("Remove")){
                //o	Remove all occurrences of {string} from the string.
                while (line.contains(secondPart)){
                    line = line.replaceAll(secondPart,"");
                }

            }



            command=scanner.nextLine();
        }
    }
}
