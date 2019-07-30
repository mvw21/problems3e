package RegularExpressions;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class matchFullName {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String regex = "\\b([A-Z][a-z]+)(?<space> [A-Z][a-z]+)";

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
//
//        boolean match = matcher.find();
//        String matchText = matcher.group();
//
        while(matcher.find()){
            System.out.print(matcher.group() + " ");

        }


//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
//        System.out.println(matcher.group(0));
//        System.out.println(matcher.group(1));
//        System.out.println(matcher.group(2));
//        System.out.println(matcher.group("space"));
//        System.out.println(matcher.replaceAll("hi"));
//        System.out.println(matcher.replaceFirst("First"));
//

    }

    //    String regex = "[A-Z][a-z]+ [a-z]+ \\d [a-z]{5} [a-z]{3}.";
//    String regex2 = "(?:Hi|hello),\\s+(\\w+)";



}

