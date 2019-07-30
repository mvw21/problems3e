package arrays;

        import java.lang.reflect.Array;
        import java.util.*;
        import java.util.stream.Collectors;

public class cherbovaaaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arrList = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> tempSum = new ArrayList<>();
        List<Integer> maxSum = new ArrayList<>();
        int counter = 1;

        boolean thereIsIndex = false;
        for (int i = 0; i < numbers.size(); i++) {



            if(counter==numbers.size()){
                break;
            }

            tempSum.add(numbers.get(i));

            for (int j = i + 1; j < numbers.size(); j++) {


                if (numbers.get(i).equals(numbers.get(j))) {
                    tempSum.add(numbers.get(j));
                    thereIsIndex=true;
                    if (tempSum.size() > maxSum.size()) {
                        maxSum.clear();
                        maxSum.addAll(tempSum);
                        counter++;
                    }

                } else {
                    tempSum.clear();

                    break;
                }

            }


        }

        if(!thereIsIndex){
            maxSum.add(numbers.get(0));
            System.out.print(maxSum.get(0));
        }else{

            for (int n : maxSum) {
                System.out.print(n + " ");
            }

        }




    }

}