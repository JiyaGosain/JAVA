import java.util.Scanner;

public class DistanceBetweenPoints 
{
    static double distance(double x1, double y1, double x2, double y2) 
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Jiya Gosain, 24csu313");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double d = distance(x1, y1, x2, y2);

        System.out.println("Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") = " + d);

        sc.close();
    }
}
