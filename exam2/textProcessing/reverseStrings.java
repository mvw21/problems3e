package textProcessing;

        import java.lang.reflect.Array;
        import java.util.*;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder newWord = new StringBuilder();
        while(!line.equalsIgnoreCase("end")){
            for (int i = line.length()-1; i >= 0 ; i--) {
                newWord.append(line.charAt(i));
            }
            System.out.println(line+" = " + newWord);
            newWord.setLength(0);
            line = scanner.nextLine();
        }

    }
}