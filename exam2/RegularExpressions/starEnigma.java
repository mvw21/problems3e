package RegularExpressions;

        import com.sun.source.tree.IfTree;
        import com.sun.source.tree.WhileLoopTree;

        import javax.swing.*;
        import java.sql.SQLOutput;
        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.stream.Collector;
        import java.util.stream.Collectors;

public class starEnigma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<String> messages = new ArrayList<>();
        String encryption = "[STARstar]";
        String power = "";
        Pattern pattern = Pattern.compile(encryption);

        for (int i = 0; i < number; i++) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);
            String realMessage = "";
            int count = 0;
            for (int j = 0; j < message.length(); j++) {

                if (matcher.find()) {
                    count++;
                }

            }
            for (int k = 0; k < message.length(); k++) {
                char letter = (char) (message.charAt(k) - count);
                realMessage += letter;

            }
            messages.add(realMessage);

        }
//        String decryption = "@([A-Za-z]+)([^@,\\-!:>]*)?:(\\d+)([^@,\\-!:>]*)?\\!([D|A])\\!([^@,\\-!:>]*)?->(\\d+)";
        String decryption = "@([A-Za-z]+)([^@_\\-:>!]):(\\d+)([^@_\\-:>!])!([A|D])!->(\\d+)";


//        String decryption = "@([A-Za-z]+)([^@,\\-!:>]*):(\\d+)([^@,\\-!:>]*)\\!([D|A])\\!([^@,\\-!:>]*)->(\\d+)"; Действа и без въпросителните




        Pattern decryptedPattern = Pattern.compile(decryption);
        ArrayList<String> attacted = new ArrayList<>();
        ArrayList<String> destroyed = new ArrayList<>();
        for (String message : messages) {
            Matcher decryptionMather = decryptedPattern.matcher(message);
            if (decryptionMather.find()) {
                if (decryptionMather.group(5).equals("A")) {
                    attacted.add(decryptionMather.group(1));
                } else {
                    destroyed.add(decryptionMather.group(1));
                }
            }
        }

        System.out.println("Attacked planets: " + attacted.size());
        Collections.sort(attacted);
        for (String s : attacted) {
            System.out.println("-> " + s);
        }
        System.out.println("Destroyed planets: " + destroyed.size());
        Collections.sort(destroyed);
        for (String s : destroyed) {
            System.out.println("-> " + s);
        }
    }

}