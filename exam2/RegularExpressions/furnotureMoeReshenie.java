package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furnotureMoeReshenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>([A-Z][A-z]+)<<(\\d+[\\.\\d+]*)!(\\d+)";
        String input = scanner.nextLine();

        List<String> line = new ArrayList<>();
        double sum =0;

        while(!input.equalsIgnoreCase("purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String name = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));
                sum+= price*quantity;
                line.add(name);
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (int i = 0; i <line.size() ; i++) {
            System.out.println(line.get(i));
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
