interface A{
	void display();
}
interface B extends A
{
	void show();
}
class Hey implements B{
	public void display()
	{
	System.out.println("This is from A");
	}
	public void show(){
	System.out.println("This is from B");
	}
}
public class FirstB
{
public static void main(String args[]){
	System.out.println("Jiya Gosain, 24csu313");
	Hey hey = new Hey();
	hey.display();
	hey.show();

}
}