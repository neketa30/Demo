package JavaPractice;

import java.io.IOException;

public class Exceptionhandling5 {
	//Unchecked exception
	/*void m()
	{
		int a=100/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Hello World");
		}
	}

	public static void main(String[] args) {
		Exceptionhandling5 obj = new Exceptionhandling5();
		obj.p();
		System.out.println("Done");
*/
	//CHecked exception
	
	
	
	void m() throws IOException
	{
		throw new IOException();
	}
	void n() throws IOException
	{
		m();
	}
	/*void p()
	{
		try{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Hello World");
		}
	}*/

	public static void main(String[] args) throws IOException {
		Exceptionhandling5 obj = new Exceptionhandling5();
		obj.n();
		System.out.println("Done");

	}

}
