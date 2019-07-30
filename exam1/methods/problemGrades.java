package methods;

        import java.util.Scanner;

public class problemGrades {
    public static void checks(double grade){
        if(grade < 2.99){
            System.out.println("Fail");
        }else if(grade >2.99 && grade <3.50){
            System.out.println("Poor");
        }else if(grade >3.49 && grade<4.50){
            System.out.println("Good");
        }else if(grade>4.49 && grade < 5.50){
            System.out.println("Very good");
        }else if(grade >5.49){
            System.out.println("Excellent");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        checks(Double.parseDouble(scanner.nextLine()));



    }
}
