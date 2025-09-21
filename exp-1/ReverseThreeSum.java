import java.util.Scanner;

class ReverseThreeSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Jiya Gosain,24csu313");

//Input a threedigitno
System.out.print("Enter a 3-digit no: ");
int a = sc.nextInt();

if(a >= 100 && a <= 999)
{
int hundreds = a /100;
int tens = (a/100)% 10;
int units = a % 10;
int sum = hundreds + tens + units;
System.out.println("Sum of digits: "+ sum);

 // Create digits array
int digits[] = {hundreds, tens, units};

System.out.print("Reversed number: ");
        for (int i=2;i>=0;i--) 
{
            System.out.print(digits[i]);
}
}else{
System.out.println("Error: Please enter a valid 3-digit number.");
}
}
}
