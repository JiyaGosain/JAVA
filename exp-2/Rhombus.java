import java.util.Scanner;

public class Rhombus {
    public static void main (String []args) {
        while(true) {
            System.out.println("Jiya Gosain, 24csu313");
            System.out.print("enter a number: ");
            Scanner inp = new Scanner(System.in);
           int n = inp.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            System.out.println("enter Y/N if u want to print more patterns: ");
            Scanner inp1 = new Scanner(System.in);
            char a = inp.next().charAt(0);
            if (a == 'N') {
                break;
            }
        }
    }
}