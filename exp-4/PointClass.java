import java.util.Scanner;
class PointClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Jiya Gosain, 24csu313");
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
	    double y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
	   double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: ");
        p1.display();
        System.out.print("Point 2: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance: %.2f\n", dist);
    }
}