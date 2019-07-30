package textProcessing;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class chchch11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] line = scanner.nextLine().split(", ");

        for (int i = 0; i < line.length ; i++) {
            if(line[i].length()>=3 && line[i].length()<=16){
                String regex = "\\b[A-Za-z0-9-_]+\\b";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line[i]);

                while (matcher.find()){
                    System.out.println(matcher.group());
                }


            }



        }
    }

}
