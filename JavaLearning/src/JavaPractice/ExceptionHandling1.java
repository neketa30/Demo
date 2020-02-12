package JavaPractice;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		//Example for arithmetic exception
		/*try {
		int a =100/0;	
			String s = null;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		
		//Example for null pointer
	/*	try{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("hey");
		}*/
		
		//Example of number format exception
	/*try
	{
		String s = "abc";
		int a = Integer.parseInt(s);
	}
	
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
		System.out.println("Rest of the code");*/
		
		//Example of arrayindexoutofboundexception
		/*try{
			int a[] = new int[5];
			a[9]= 20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");*/
		
		try {
			int a=100/0;
	System.out.println(a);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("hello world");
		}
		
		

	}

}
