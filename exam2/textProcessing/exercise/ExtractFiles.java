package textProcessing.exercise;

        import java.util.Scanner;
        import java.util.regex.Pattern;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String separator = "\\";
        String[] str_arr=line.replaceAll(Pattern.quote(separator), "\\\\").split("\\\\");


        String j = str_arr[str_arr.length-1];

        String[] split = j.split("\\.");
        String fileName = split[0];
        String fileExtension = split[1];

        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+fileExtension);
    }
}


// По кратко решение :

//
//package textProcessing.exercise;
//
//        import java.util.Scanner;
//
//public class chernovaAaA {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] line = scanner.nextLine().split("\\\\");
//
//        for (int i = line.length-1; i > line.length-2 ; i--) {
//            String[] word = line[i].split("\\.");
//            System.out.println("File name: "+word[0]);
//            System.out.println("File extension: "+word[1]);
//        }
//    }
//}
