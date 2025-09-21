import java.util.Scanner;

class Right_triangle {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jiya Gosain, 24csu313");

        int n = 5;
        for (int i=1; i<=n; i++) 
        {
            //print spaces
            for (int k=1; k <= n-i; k++) 
            {
                System.out.print(" ");
            }
        
            for (int j=1; j<=i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
