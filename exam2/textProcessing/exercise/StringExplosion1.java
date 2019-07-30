package textProcessing.exercise;
import java.util.*;


public class StringExplosion1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        // трябва да ходя по символте докато намеря експлозия

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            builder.append(symbol);

            if (symbol == '>'){
                i++;
                int power = text.charAt(i)- '0';

                int j = i;
                for (; j < i+ power && j< text.length(); j++) {
                    if(text.charAt(j) == '>'){
                        builder.append('>');
                        power += (text.charAt(j + 1) - '0')+1;
                        j++;
                    }
                }

                i = j - 1;
            }
        }

        System.out.println(builder.toString());
    }
}