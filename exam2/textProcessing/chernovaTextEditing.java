package textProcessing;

import java.lang.reflect.Array;
import java.util.*;

public class chernovaTextEditing {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();

            String text ="";
            text = line2.replaceAll("line1","");
            System.out.println(text);

//           StringBuilder sb = new StringBuilder();
//
//           sb.append("Hello World!");
//           sb.setLength(0);
//           sb.append("aasdasdasd");
//           sb.insert(0,"Ivanov");
//           System.out.println(sb);
//
//           sb.replace(0,6,"-----");
//            System.out.println(sb);




            //stringBuilder takes much lesser time!
//            System.out.println(new Date());
//        StringBuilder sv = new StringBuilder();
//
//            for (int i = 0; i < 1000000; i++) {
//                sv.append("a");
//            }
//
//
//            System.out.println(new Date());







//
//        String world = "Hello , world , I love you world , cuz you are the best world.";
//        String replacedText = world.replace("world","universe");
//            System.out.println(replacedText);

//            String[] banned = scanner.nextLine().split(", ");
//            String banned1 = banned[0];
//            String banned2 = banned[1];
//            String banned3 = banned[2];
//
//            String text = scanner.nextLine();
//
//            String newtext = text.replace(banned1,method1(banned1));
//            String newerText = newtext.replaceAll(banned2,method1(banned2));
//            String newest = newerText.replaceAll(banned3,method1(banned3));
//            System.out.println(newerText);
//
//
//
//
//
//        }
//        private static String method1(String banned1){
//            String result="";
//            for (int i = 0; i <banned1.length() ; i++) {
//                result+="*";
//            }
//            return result;
        }
        private static String repeat(String s, int length){
            String text ="";
            for (int i = 0; i <length ; i++) {
                text+= s;
            }
            return text;
        }
}
