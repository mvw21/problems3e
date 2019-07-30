package lists;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class gaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        int size = line.size();


        for (int i = 0; i <size ; i++) {
            if(size-i==1){

                break;
            }
            int newint = line.get(i)+line.get(size-1);
            line.set(i,newint);
            line.remove(size-1);
            size = line.size();
        }

        for(int n : line){
            System.out.print(n+" ");
        }

    }
}




