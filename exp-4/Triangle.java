import java.util.Scanner;
class Triangle{
	int s1,s2,s3;
	Triangle()
	{
	s1=3;
	s2=4;
	s3=5;
	}
	void perimeter()
	{
	System.out.println("Perimeter is "+(s1+s2+s3));
    }
	void area()
	{
	System.out.println("Area is "+(s2/2)*s1);
	}
	public static void main(String args[]){
	Triangle ob=new Triangle();
	System.out.println("Jiya Gosain, 24csu313");
	ob.perimeter();
	ob.area();
	}

}

