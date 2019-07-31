package demoExam2;




import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class emojiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String emojiCode = scanner.nextLine();
        emojiCode = decryptMessage(emojiCode);
        String regex = "(?<=[\\s])(?<emoji>:[a-z]{4,}:)(?=[\\s,.!?])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> emojiFoundList = new ArrayList<>();
        int totalPower = 0;
        boolean isEmojiFound = false;
        while (matcher.find()) {
            String emoji = matcher.group("emoji");
            String originalEmoji = emoji.substring(1, emoji.length() - 1);
            if (originalEmoji.equals(emojiCode)) {
                isEmojiFound = true;
            }
            int sum = 0;
            for (int i = 0; i < originalEmoji.length(); i++) {
                sum += (int) (originalEmoji.charAt(i));
            }
            totalPower += sum;
            emojiFoundList.add(emoji);
        }
        if (emojiFoundList.size() > 0) {
            System.out.println("Emojis found: " + String.join(", ", emojiFoundList));
        }
        if (isEmojiFound) {
            System.out.println("Total Emoji Power: "+totalPower * 2);
        } else {
            System.out.println("Total Emoji Power: " + totalPower);
        }
    }

    private static String decryptMessage(String message) {
        String regex = "[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append((char) (Integer.parseInt(matcher.group(0))));
        }
        return result.toString();
    }
}