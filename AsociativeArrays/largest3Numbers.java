package AsociativeArrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largest3Numbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ordering a list , using Stream API
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1,n2)->n2.compareTo(n1))
                .collect(Collectors.toList());

        if(sorted.size()<3){
            for(int n : sorted){
                System.out.print(n+" ");
            }
        }else{
            for (int i = 0; i < 3 ; i++) {
                System.out.print(sorted.get(i)+ " ");
            }
        }

    }
}









