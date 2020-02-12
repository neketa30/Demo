package JavaPractice;

public class ExceptionHandling4 {
	
	public static void main(String args[])
	{
		try{
			int a=25/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.exit(1);
		}
		
		finally
		{
			System.out.println("Finally code has been exceuted");
		}
		System.out.println("Rest of the code");
	}

}
