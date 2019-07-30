package lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] line = scanner.nextLine().split(" ");

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        if(numbers.size()==2){
            if(numbers.get(0).equals(numbers.get(1))){
                numbers.set(0,(numbers.get(0)+numbers.get(1)));
                numbers.remove(1);
            }
        }
        for (int i = 0; i < numbers.size()-1 ; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i,(numbers.get(i)+numbers.get(i+1)));
                numbers.remove(i+1);
                i=-1;
            }

        }
        for(double i : numbers){
//            System.out.printf("%.0f"+" ", i);
            System.out.print(new DecimalFormat("0.####").format(i)+" ");
        }





    }
}












     /*   String line = scanner.nextLine();
        List<Integer> numbers = parseLineOfNumbers(line);

        int index = 0;
        while(index<numbers.size()){
            int curr = numbers.get(index);
            int next = numbers.get(index+1);

            if(curr == next){
                int sum = curr+next;
                numbers.set(index,sum);
                numbers.remove(index+1);

            }else{
                index++;

            }

        }

                for(int number : numbers){
                    System.out.print(number + " ");

                }
    }

    private static List parseLineOfNumbers(String line) {
        String[] strings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String string : strings){
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }

}
*/