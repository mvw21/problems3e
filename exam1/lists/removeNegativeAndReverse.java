package lists;

import java.util.*;
import java.util.stream.Collectors;

public class removeNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        line.removeIf(n->n<0);
        Collections.reverse(line);

        if(line.isEmpty()){
            System.out.println("empty");
        }else{
//            System.out.println(line.toString().replaceAll("[\\[\\],]",""));
            for(int j : line){
                System.out.print(j + " ");
            }
        }


    }
}
