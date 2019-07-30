package textProcessing.exercise;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class DigitsLettersAndOthers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String regexNums = "\\d+";

        Pattern pattern = Pattern.compile(regexNums);
        Matcher matcher = pattern.matcher(line);

        while(matcher.find()){
            System.out.print(matcher.group());
        }
        System.out.println();

        String regexLetters = "[A-Za-z]+";
        Pattern pattern1 = Pattern.compile(regexLetters);
        Matcher matcher1 = pattern1.matcher(line);

        while(matcher1.find()){
            System.out.print(matcher1.group());
        }
        System.out.println();

        String regexSymbols = "[\\W_]+";
        Pattern pattern2 = Pattern.compile(regexSymbols);
        Matcher matcher2 = pattern2.matcher(line);

        while(matcher2.find()){
            System.out.print(matcher2.group());
        }
    }

}
