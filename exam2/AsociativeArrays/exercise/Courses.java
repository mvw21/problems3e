package AsociativeArrays.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// MAP ot STRING i List !

public class Courses {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input;

        while(!"end".equals(input=read.readLine())){

            String[] data = input.split(" : ");

            courses.putIfAbsent(data[0],new ArrayList<>());
            courses.get(data[0]).add(data[1]);
        
        }
        //print the courses,ordered by the count of registered users in descending order.
        //For each contest print registered users ordered by name in ascending order.
      courses.entrySet().stream()
          .sorted((x1,x2)->Integer.compare(x2.getValue().size(),x1.getValue().size()))
          .forEach(x->{
            System.out.println(String.format("%s: %d",x.getKey(),x.getValue().size()));
            Collections.sort(x.getValue());
            x.getValue().forEach(a-> System.out.println("-- "+a));
        });
    }
}

/*   
Output example:
Programming Fundamentals: 2
-- John Smith
-- Linda Johnson
JS Core: 1
-- Will Wilson
Java Advanced: 1

/*
