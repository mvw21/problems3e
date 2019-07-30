package lists.exercise;

        import java.util.Scanner;

public class problemOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;


//
//        for (int i = 1; i <= days; i++) {
//            if (i % 10 == 0) {
//                people -= 2;
//            }
//            if (i % 15 == 0) {
//                people += 5;
//            }
//            sum += (50 - (people * 2));
//
//            if (i % 3 == 0) {
//                sum -= (people * 3);
//            }
//            if (i % 5 == 0) {
//                sum += (people * 20);
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                sum -= (people * 2);
//            }
//        }

        while (days > 0) {
            if (counter % 10 == 0) {
                people -= 2;
            }

            if (counter % 15 == 0) {
                people += 5;
            }

            sum += (50 - (people * 2));

            if (counter % 3 == 0) {
                sum -= (3 * people);
            }

            if(counter%5 ==0){
                sum+=people*20;
            }

            if (counter % 5 == 0 && counter % 3 == 0) {
                sum -= people* 2 ;
            }


        counter++;
        days--;
    }

        int avg = sum/people;

        System.out.printf("%d companions received %d coins each.",people,avg);
//        System.out.print(people+ " companions received " + avg +" coins each");

    }
}



