package JavaPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exceptionhandling2 {

	public static void main(String[] args)  {
		//Example to resolve the exception in catch block
		
	/*	int a=100;
		int b=0;
		int data;
		
		try {
			data=a/b;
		}
		catch(ArithmeticException e)
		{
			int c= a/(b+2);
			System.out.println(c);
		}
*/
		
		//Example to exception also occurs in catch block
	/*	try{
			int a=100/0;
		}
		catch(ArithmeticException e)
		{
			int b=200/0;
			System.out.println(e);
		}*/
		
		/*try {
			int a=100/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e77);
		}*/
		
		//Example of Checked exception
		
	/*	try{
		FileReader filereader1 = new FileReader("C://Test.xlsx");
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			
		}*/
		
/*		try
		{
			Class.forName("Test124");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}*/
		
		//Error
		
		long a[]= new long[10000000];
		System.out.println();
	}

}
