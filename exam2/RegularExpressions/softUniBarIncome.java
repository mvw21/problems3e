package RegularExpressions;

        import java.util.HashMap;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.stream.Collectors;

public class softUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%([A-Z][a-z]+)%[^|%.$]*?<(\\w+)>[^|%.$]*\\|(\\d+)\\|[^|%.$]*?(\\d+\\.?\\d+?)\\$";




//        String regex = "%([A-Z][a-z]+)%[^|%.$]*?<(\\w+)>[^|%.$]*?\\|(\\d+)\\|[^|%.$]*?(\\d+\\.?\\d+?)\\$";
//        на тоя ред след звездата бачка и с и без ? , ама май е по добре да се слага
//        String regex = "%([A-Z][a-z]+)%([^|$%.]*)<(\\w+)>([^|$%.]*)\\|(\\d+)\\|([^|$%.]*)(\\d+.\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group(1);
                String product = matcher.group(2);
                int quantity = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double cost = quantity * price;
                totalIncome += cost;
                System.out.println(String.format("%s: %s - %.2f", name, product, cost));
//                System.out.printf("%s: %s - %.2f\n", name, product, cost);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}