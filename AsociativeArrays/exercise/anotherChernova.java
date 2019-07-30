package AsociativeArrays.exercise;

import java.text.DecimalFormat;
import java.util.*;

public class anotherChernova {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] n = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    TreeMap<Integer,Integer> threeMap = new TreeMap<>();
    //как подпъхваш в мап някакъв кей и неговото value;
    for(int y : n ){
        if(!threeMap.containsKey(y)){
            threeMap.put(y,0);
        }
            threeMap.put(y,threeMap.get(y)+1);
    }

    //Как печаташ мап

        for(Map.Entry<Integer, Integer>entry : threeMap.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()),entry.getValue());

        }

//How to print out Maps :
//        Map<String,Double> fruits = new LinkedHashMap<>();
//        fruits.put("banana",2.20);
//        fruits.put("kiwi",4.50);
//
//        for(Map.Entry entry : fruits.entrySet()){
//            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
//        }


//        TreeMap<Integer, Integer> airplanes = new TreeMap<>();
//        airplanes.put(3,111);
//        airplanes.put(29999,3);
//        airplanes.put(1, 111);
//        airplanes.put(17, 11111);
//        airplanes.put(7, 11111);
//        airplanes.remove(7);
//
//        if(airplanes.containsKey(7)){
//            System.out.println("Hello");
//        }
//
//        System.out.println(airplanes.containsValue(111));


    }

}
