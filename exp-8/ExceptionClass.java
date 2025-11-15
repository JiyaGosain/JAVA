class ClassException extends Exception{
	String s;
	
	ClassException(String s){
		this.s = s;
	}
	public void message(){
		System.out.println("The stored argument is: "+s);
	}
}

public class ExceptionClass{
	public static void main(String[] args){
		System.out.println("Jiya Gosain, 24csu313");
		try{
			throw new ClassException("This is an exception message.");
			
		}
		catch(ClassException e){
			e.message();
		}
	}
}