package lists.exercise;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;
/*

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());
        String[] line = scanner.nextLine().split(" +");

        int specialNumber = Integer.parseInt(line[0]);
        int power = Integer.parseInt(line[1]);

        for (int i = 0; i < numbers.size(); i++) {
                int n = numbers.get(i);
                if(n==specialNumber){
                    int counter = 0;
                    for (int j = i; j < j+power ; j++) {

                        if(j+1>=0 && j+1<numbers.size()){
                            numbers.remove(j+1);
                            j-=1;
                            counter++;
                            if(counter == power){
                                break;
                            }
                        }else{
                            break;
                        }


                    }

                    for (int j = i; j >=  power-1 ; j--) {

                        if(j>=0 && j<numbers.size()){

                        }
                        numbers.remove(j);
                    }
                }
        }
        int sum = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            sum+= numbers.get(i);
        }

        System.out.println(sum);
    }
}

*/



public class bombNumbers {
    public static void main(String[] args) {

//        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());
//        String[] data = ared.readLine.split("\\s+");
        String[] data = scanner.nextLine().split(" +");



        int bombNumber = Integer.parseInt(data[0]);
        int sizeOfBomb = Integer.parseInt(data[1]);

        while (numbers.contains(bombNumber)){
            int elementIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - sizeOfBomb);
            int right = Math.min( elementIndex + sizeOfBomb, numbers.size() - 1);

            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            int nn = numbers.get(i);
            sum+=nn;
        }

        System.out.println(sum);

    }
}