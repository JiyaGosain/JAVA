import java.util.Scanner;
class Vehicle
{
	void display()
	{
		System.out.println("This is Vehicle");
	}
} 
class Car extends Vehicle
{
	void display()
	{
		System.out.println("This is a Car");
	}
}
class Bike extends Vehicle
{
	void display()
	{
		System.out.println("This is a Bike");
	}
}  
class MainClassTwo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Jiya Gosain, 24csu313");
		int N;
		System.out.println("Enter value if N: ");
		N=scan.nextInt();

		Vehicle v;
		switch(N)
		{
			case 2:
				v = new Bike();
				break;
			case 4:
				v = new Car();
				break;
			default:
				v = new Vehicle();
		}
		v.display();
	}
}