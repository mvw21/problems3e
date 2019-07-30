package AsociativeArrays.exercise;
        import java.util.*;

public class Orders {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> products = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!"buy".equals(command)) {
            String[] data = command.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Integer.parseInt(data[2]);

            if (!products.containsKey(product)) {
                products.put(product, new ArrayList<>(Arrays.asList(price, quantity)));
            } else {
                List<Double> newPrice = new ArrayList<>();
                newPrice.add(price);
                double oldQuantity = products.get(product).get(1);
                newPrice.add(oldQuantity + quantity);
                products.put(product, newPrice);
            }
            command = scanner.nextLine();
        }

        products.forEach((key, value) -> {
            double multiply = value.get(0) * value.get(1);
            System.out.printf("%s -> %.2f%n", key, multiply);
        });
    }
}