class CheckArgumentException extends Exception 
{
    	public CheckArgumentException(String s) 
    	{
        	super(s);
    	}
}

public class ExceptionsFirst
{
    	public static void main(String[] args) 
    	{
		System.out.println("Jiya Gosain, 24csu313");
        	try {
            		if(args.length < 5) 
            		{
                		throw new CheckArgumentException("Error: You can only enter 5 integer arguments.");
            		}
            		int sum=0;
            		for(int i=0;i<5;i++)
            		{
                		sum += Integer.parseInt(args[i]);
            		}
            		System.out.println("Sum of 5 numbers = "+sum);
			} 
			catch(CheckArgumentException e)
			{
            			System.out.println(e.getMessage());
        		} 
			catch(NumberFormatException e)
			{
            			System.out.println("This is not a valid input.");
        	}
    	}
}