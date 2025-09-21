import java.util.Scanner;
class Student{
	String name;
	int roll_no;

	Student()
	{
	name="John";
	roll_no=2;
	}
	void display(){
	System.out.println("Name: "+name+"\nRoll No: " +roll_no);
	}
	public static void main(String args[]){
	     Student ob=new Student();
	     System.out.println("Jiya Gosain, 24csu313");
	     ob.display();
	}
}