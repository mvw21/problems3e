package lists.exercise;

        import java.text.DecimalFormat;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class chernova2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" +")).map(Double::parseDouble).collect(Collectors.toList());

        if(numbers.size()==2){
            if(numbers.get(0).equals(numbers.get(1))){
                numbers.set(0,(numbers.get(0)+numbers.get(1)));
                numbers.remove(1);
            }
        }

        for (int i = 0; i <numbers.size()-1 ; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i,(numbers.get(i)+numbers.get(i+1)));
                numbers.remove(i+1);
                i=-1;
            }
        }
        for(double j : numbers){
            System.out.print(new DecimalFormat("0.####").format(j)+" ");
        }
    }
}