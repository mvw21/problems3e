package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String regex = "\\+359([ -])2([ -])\\d\\d\\d([ -])\\d\\d\\d\\d\\b";


        String input = scanner.nextLine();
        List<String> matchedPhones = new ArrayList<>();


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);


        while(matcher.find()){
            matchedPhones.add(matcher.group());
        }


//        while(matcher.find()){
//            System.out.print(matcher.group()+", ");
//        }

        System.out.println(String.join(", ",matchedPhones));




    }
}
