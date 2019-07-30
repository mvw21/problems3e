package lists.exercise;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String nextline = scanner.nextLine();

        while(!nextline.equalsIgnoreCase("end")){
            String[] split = nextline.split(" +");
            String part1 = split[0];
            int part2 = Integer.parseInt(split[1]);

            if(part1.equalsIgnoreCase("Delete")){
//                int size = line.size();

                while(line.contains(part2)){
                    line.remove(Integer.valueOf(part2));
                }





            }else if(part1.equalsIgnoreCase("Insert")){
                int part3 = Integer.parseInt(split[2]);
                if(part3>=0 && part3< line.size()){
                    line.add(part3,part2);
                }


            }
            nextline=scanner.nextLine();
        }

        for(int n : line){
            System.out.print(n+" ");
        }

    }
}
