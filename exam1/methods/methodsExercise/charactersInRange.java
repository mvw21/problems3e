package methods.methodsExercise;

        import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char begin = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        System.out.println(lineOfChars(begin,end));

    }
    static String lineOfChars(char begin,char end){
        String result = "";
        char backup ;
        if(end<begin){
            backup = begin;
            begin = end;
            end = backup;
        }
        for (int i = begin+1; i <= end-1; i++) {
            char letter = (char)i;
            result+= letter+" ";
        }

        return result;
    }
}
