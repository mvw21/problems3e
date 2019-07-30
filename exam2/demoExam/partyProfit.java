package demoExam;

import java.util.Scanner;

public class partyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;


        while(days >0){
            if(counter%10 ==0){
                people-=2;
            }

            if(counter%15==0){
                people +=5;
            }

            sum+=48*people;

            if(counter%3==0){
                sum-= 3*people;
            }

            if(counter%5 ==0){
                sum+= 20 * people;
                if(counter%3 ==0){
                    sum-= 2 * people;
                }
            }
            counter++;
            days--;
        }

        int avg = sum/people;

        System.out.printf("%d companions received %d coins each.",people,avg);

    }
}
