//prime number 
import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) 
    {
 System.out.print("Jiya Gosain, 24csu313 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
 else 
{
            for (int i = 2; i <= num; i++) 
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
            }
          }
        }

        if (isPrime) 
        {
            System.out.println(num + " is a prime number");
        }
 else 
{
            System.out.println(num + " is not a prime number");
     }
  }
}