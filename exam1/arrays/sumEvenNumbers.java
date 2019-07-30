package arrays;

import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String[] inputArStr  = input.split(" ");

        int[] inputIntAr  = new int [inputArStr.length];

        int sum = 0;

        for (int i = 0; i <inputIntAr.length ; i++) {

            inputIntAr[i] = Integer.parseInt(inputArStr[i]);

            if (inputIntAr[i] % 2 == 0){
                sum += inputIntAr[i];


            }


        }

        System.out.println(sum);
    }

}




  /*  //String arrays = sc.nextLine();
    int []n = Arrays.stream(sc.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();

    int sum = Arrays.stream(n).filter(e -> e % 2 == 0).sum();
        System.out.println(sum);

                }
                }*/



/*

    String input = scanner.nextLine();


    String str []= input.split(" ");

    //   int n = Integer.parseInt(scanner.nextLine());
    int num[]= new int[str.length];
    //     Arrays.stream(scanner.nextLine().split(" "))
    //             .mapToInt(e -> Integer.parseInt(e) )
    //           .toArray();
    int sum = 0;
        for (int i = 0;i<num.length;i++){
        num[i]=Integer.parseInt(str[i]);
        if (num[i] % 2 == 0){
        sum+=num[i];
        }
        }
        System.out.println(sum);



        }
        }*/
