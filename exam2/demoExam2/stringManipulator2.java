package demoExam2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringManipulator2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder string = new StringBuilder();

        String input;

        while(!"End".equals(input=read.readLine())){

            String[] data = input.split("\\s+");

            switch (data[0]){
                case "Add":
                    string.append(data[1]);
                    break;
                case "Upgrade":
                    string = upgradeString(string,(data[1]));
                    break;
                case "Print":
                    System.out.println(string);
                    break;
                case "Index":
                    findIndexes(data[1],string);
                    break;
                case "Remove":
                    string=removeText(data[1],string);
                    break;
            }

        }

    }

    private static StringBuilder removeText(String removeText, StringBuilder string) {
        String result = string.toString();


        while (result.contains(removeText)){
            result=result.replace(removeText,"");
        }

        StringBuilder asd = new StringBuilder();
        asd.append(result);

        return asd;
    }

    private static void findIndexes(String charecter, StringBuilder string) {
        StringBuilder indexes = new StringBuilder();

        int startIndex = string.indexOf(charecter);

        if (startIndex!=-1){
            indexes.append(startIndex).append(" ");
        }

        while (startIndex!=-1){
            int nowIndex = string.indexOf(charecter,startIndex+1);
            startIndex=nowIndex;

            if (nowIndex!=-1){
                indexes.append(nowIndex).append(" ");
            }
        }

        if (indexes.length()!=0){
            System.out.println(indexes);
        }else {
            System.out.println("None");
        }
    }

    private static StringBuilder upgradeString(StringBuilder string, String charecter) {
        StringBuilder result = new StringBuilder();
        char a = charecter.charAt(0);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==a){
                int newChar = a+1;
                result.append((char)newChar);
            }else {
                result.append(string.charAt(i));
            }
        }
        return result;
    }
}