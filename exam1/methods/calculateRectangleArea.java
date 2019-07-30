package methods;

        import java.util.Scanner;

public class calculateRectangleArea {
    private static double getRectangleArea(double width,double height){
        return width*height;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double area = getRectangleArea(a,b);
        System.out.printf("%.0f",area);


    }
}
