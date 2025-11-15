import java.util.Scanner;
class Animal{
	void eat(){
	System.out.println("Animal is eating...");
	}
}

interface Pet{
	void play();
}

interface Wild{
	void hunt();
}

class Dog extends Animal implements Pet, Wild{
	public void play()
	{
	System.out.println("Dog loves to play fetch!");
	}

	public void hunt()
	{
	System.out.println("Dog can eat when trained");
	}
	void eat(){
	System.out.println("Dog eats dog food.");
	}
}
public class TestClassInterface{
	public static void main(String args[]){
		System.out.println("Jiya Gosain, 24csu313");

	Dog d = new Dog();
	d.eat();
	d.play();
	d.hunt();
	}
}
