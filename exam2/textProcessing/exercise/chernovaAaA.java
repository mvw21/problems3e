package textProcessing.exercise;

        import java.util.Scanner;

public class chernovaAaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int power = 0;
        for (int i = 0; i <line.length() ; i++) {
            if(!Character.isDigit(line.charAt(i))){
                sb.append(line.charAt(i));
            }else{
                System.out.println(line.charAt(i));
                if(line.charAt(i) -'0' != 1 && line.charAt(i) -'0' != 0){
                    power = power +((line.charAt(i)) - '0');
                    index = i;

                    int counter = 0;
                    for (int j = index; j <index+power ; j++) {

                        if(line.charAt(j) == '>'){
                            power -= counter;
                            i+=counter;
                            i--;
                            index=0;
                            break;
                            //Тука може и да трябва да увеличавам i за готния цикъл.

                        }
                        counter++;
                    }
                }


            }


        }


    }
}
