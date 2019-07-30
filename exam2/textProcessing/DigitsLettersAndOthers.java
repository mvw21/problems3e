package textProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = scanner.nextLine().split("");
        List<String> line = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        List<String> symbols = new ArrayList<>();



        for (int i = 0; i < str.length ; i++) {
            String currecntChar = str[i];
            line.add(currecntChar);
        }

        for (int i = 0; i < line.size() ; i++) {
            String c = line.get(i);
            if(Character.isDigit(c.charAt(0))){
                digits.add(c);
            }else if(Character.isLetter(c.charAt(0))){
                letters.add(c);
            }else{
                symbols.add(c);
            }
        }

        for(String s : digits){
            System.out.print(s);
        }
        System.out.println();

        for(String m : letters){
            System.out.print(m);
        }
        System.out.println();

        for(String g : symbols){
            System.out.print(g);
        }

        }

    }

