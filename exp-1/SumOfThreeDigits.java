//Sum of ThreeDigits
import java.util.Scanner;

public class SumOfThreeDigits{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Jiya Gosain, 24csu313");

	//Input a threedigitnumber
	System.out.print("Enter a 3-digit number");
	int a = sc.nextInt();

	if (a >= 100 && a <= 999)
	{
	int hundreds = a/100;
	int tens = (a/10)%10;
	int units = a %10;
	int sum = hundreds + tens + units;

	System.out.println("Sum of digits: "+sum);
	}
	else{
	System.out.println("Error: Please enter a valid 3-digit number.");
	}
}
}
