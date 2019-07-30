package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String regex = ">>([A-Z][A-z]+)<<(\\d+[\\.\\d{2}]*)!(\\d+)";
//        String regex = ">>([A-Z][A-z]+)<<(\\d+[\\.\\d{2}]*)!(\\d+)";
        String regex = ">>([A-Z][A-z]+)<<(\\d+[\\.\\d{2}]*)!(\\d+)";

//        String regex = ">>([A-Za-z]+)<<(\\d+[\\.\\d+]*)!(\\d+)";
        // Това (\\d+[\\.\\d+]*) e инт последван с точка и нов инт - за double реално число. Може да има .числа , може и да няма.

        String input = scanner.nextLine();

        List<String> furniture = new ArrayList<>();

        double sum = 0;


        while (!input.equals("Purchase")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String name = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                sum += price * quantity;
                furniture.add(name);
            }


            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (int i = 0; i <furniture.size() ; i++) {
            System.out.println(furniture.get(i));
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}