package textProcessing.exercise;

        import java.util.Scanner;

public class ceaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <line.length() ; i++) {
            int currentChar = line.charAt(i);
            int newChar = currentChar+3;
            sb.append((char)newChar);
        }

        System.out.println(sb);
    }
}
