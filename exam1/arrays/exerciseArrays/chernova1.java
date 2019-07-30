package arrays.exerciseArrays;

import java.util.Scanner;

public class chernova1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String line0 = scanner.nextLine();
        int bestSum=0;
        int bestLength=0;
        String bestDna="";
        int bestCounter = 0;
        int counter = 0;
        int bestIndex = 0;
        while(!line0.equalsIgnoreCase("Clone them!")){
            counter++;
            String line = line0.replaceAll("!+","");
            String[] dnas = line.split("0");
            int sum = 0;
            int maxLength = 0;
            String bestLocalDna = "";
            for (int i = 0; i <dnas.length ; i++) {
                if(dnas[i].length()>maxLength){
                    maxLength = dnas[i].length();
                    bestLocalDna = dnas[i];
                }
                sum+=dnas[i].length();
            }

            int beginIndex = line.indexOf(bestLocalDna);

            if(maxLength>bestLength){
                bestLength=maxLength;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestDna=line;
                bestSum=sum;

            }else if(maxLength==bestLength && (beginIndex<bestIndex || sum>bestSum)){
                bestLength=maxLength;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestDna=line;
                bestSum=sum;
            }else if(counter ==1){
                bestLength=maxLength;
                bestIndex = beginIndex;
                bestCounter = counter;
                bestDna=line;
                bestSum=sum;
            }

            line0 = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.",bestCounter,bestSum);
        System.out.println();
        for(int i = 0; i < bestDna.length();i++){
            System.out.print(bestDna.charAt(i)+ " ");
        }
    }
}
