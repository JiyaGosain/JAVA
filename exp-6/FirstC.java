interface A{
	void display();
}
interface B{
	void show();
}
interface C extends A,B{
	void print();
}
class Hey implements C{
	public void display(){
	System.out.println("This is from Interface A");
	}
	public void show(){
	System.out.println("This is from Interface B");
	}
	public void print(){
	System.out.println("This is from Interface C");
	}
}
public class FirstC{
	public static void main(String args[])
	{
	System.out.println("Jiya Gosain, 24csu313");
	Hey hey = new Hey();
	hey.display();
	hey.show();
	hey.print();
    }
}