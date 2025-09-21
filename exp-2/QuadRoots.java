import java.util.Scanner;
class QuadRoots {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");
Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

       double d = b * b - (4 * a * c); //discriminant 

if(d>0){
 System.out.println("the roots are distict and real "); 
double r1 = (-b + Math.sqrt(d)) / (2 * a);
 double r2 = (-b - Math.sqrt(d)) / (2 * a);
 System.out.print("the roots are : " +r1 + " and " + r2  );
} 
else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Real and equal roots:");
            System.out.println("Root is = " + root);
        } 
else {
double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imagPart );
            System.out.println("Root 2 = " + realPart + " - " + imagPart );
        }
    }
}