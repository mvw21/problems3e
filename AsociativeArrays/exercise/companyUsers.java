package AsociativeArrays.exercise;
import java.sql.SQLOutput;
import java.util.*;

public class companyUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("end")){

            String[] tokens = input.split(" -> ");
            String university = tokens[0];
            String studentId = tokens[1];

            companyEmployees.putIfAbsent(university, new ArrayList<>());
            if (!companyEmployees.get(university).contains(studentId))
                companyEmployees.get(university).add(studentId);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }

        }


    }
}






