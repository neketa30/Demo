package JavaPractice;

public class ExceptionHandling3 {
	
	public static void main(String args[])
	{
		/*try
		{
			int a=300/0;
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		
		//Nested try catch example
		
		try{
			 String s= null;
			 System.out.println(s.length());
			 
			try
			{   
				int a1[] = new int[5];
			System.out.println(a1[10]);
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				
			}
			try
			{   
				int a =100/0;
			System.out.println(a);
			
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				
			}
		}
			catch(Exception e)
			{
				System.out.println("tHIS IS IT");
			}
		}
		
	}


	


		
	