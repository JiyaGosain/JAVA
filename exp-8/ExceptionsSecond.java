public class ExceptionsSecond{
	public static void main(String[] args){
		System.out.println("Jiya Gosain, 24csu313");
		try {
            		throw new Exception("Manually thrown Exception");
        	} 
		catch (Exception e) {
            		System.out.println("Caught Exception: " + e.getMessage());
        	}
		finally {
            		System.out.println("Finally block executed.");
        	}
	}
}