package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergigngLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        List<Integer> resultNums = new ArrayList<>();

        if(nums1.size()>=nums2.size()){
            for (int i = 0; i < nums1.size(); i++) {
                resultNums.add(nums1.get(i));
                if(i<nums2.size()){
                    resultNums.add(nums2.get(i));
                }
            }
        }else {
            for (int i = 0; i <nums2.size() ; i++) {
                if(i< nums1.size()){
                    resultNums.add(nums1.get(i));
                }
                resultNums.add(nums2.get(i));
            }
        }
        for(int n : resultNums){
            System.out.print(n+" ");
        }

    }
}
