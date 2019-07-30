package AsociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,String> parking = new LinkedHashMap();

        for (int i = 1;i<=n;i++){
            String comanda =scanner.nextLine();
            String [] tokens =  comanda.split("\\s+");
            String key =tokens[1];

            if (tokens[0].equals("register")){
                String value = tokens[2];
                if (parking.containsKey(key)){
                    System.out.printf("ERROR: already registered with plate number %s%n",value);
                }else {
                    parking.put(key,value);
                    System.out.printf("%s registered %s successfully%n",key,value);
                }
            }else  if (tokens[0].equals("unregister")){
                if (!parking.containsKey(key)){
                    System.out.printf("ERROR: user %s not found%n",key);
                }else {
                    parking.remove(key);
                    System.out.printf( "%s unregistered successfully%n",key);

                }
            }
        }
        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}