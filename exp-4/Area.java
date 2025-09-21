import java.util.Scanner;
class Area
{
	int length;
	int breadth;
	Area(int l,int b)
	{
	length=l;
	breadth=b;
	}
	int returnArea()
	{
	return (length*breadth);
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Jiya Gosain, 24csu313");
	System.out.println("Enter length and breadth: ");
	int l=sc.nextInt();
	int b=sc.nextInt();
	Area ob=new Area(l,b);
	System.out.println("Area is: "+ob.returnArea());

	}
}