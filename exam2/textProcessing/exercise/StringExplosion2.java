package textProcessing.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class StringExplosion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);
            chars.add(current);

        }

        for (int i = 0; i < chars.size(); i++) {

            char current = chars.get(i);

            int nextIndex = i + 1;

            if (current == '>' && (i + 1) < chars.size()){

                int power = chars.get(i + 1) - '0';  //-48

                for (int j = i + 1; j < i + 1 + power; j++) {

                    if (j < chars.size()){

                        if (chars.get(j) != '>'){
                            chars.set(j, (char) 42);
                        } else {
                            power += (chars.get(j + 1) - 48) + 1;
                        }
                    }
                }
            }
        }

        for (Character character : chars) {

            if (character != 42){
                System.out.print(character);
            }
        }

    }
}