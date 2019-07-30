package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String regex = "(\\d{2})([\\./|\\-])([A-Z][a-z]{2})\\2(\\d{4})";    // - точка , тире или forward slash
//        String regex = "(\\d{2})([\\./|\\-])([A-Z][a-z]{2})\\2(\\d{4})";    //това с тия трите^ става само така , незнам защо , странно е ([\./|\-])
        String regex = "(\\d{2})([-./])([A-Z][a-z]{2})\\2(\\d{4})";       //и така става явно ([-./])



        String input = scanner.nextLine();

        List<String> names = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            names.add("Day: " + matcher.group(1) + ", Month: " + matcher.group(3) + ", Year: " + matcher.group(4));

        }
        System.out.println(String.join("\n",names));
    }
}
