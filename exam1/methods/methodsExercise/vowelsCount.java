package methods.methodsExercise;


import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println(countVowels(text));


    }
    static int countVowels(String text){
        int counter = 0;

        String table = "aeiouAEIOU";
        for (int i = 0; i <text.length() ; i++) {
            char letter = text.charAt(i);
            if(table.contains(letter+"")){
                counter++;
            }
        }
        return counter;
    }
}
