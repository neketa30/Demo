package JavaPractice;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=20;
		a[3]=20;
		a[4]=20;
		//System.out.println(a[4]);
		
		System.out.println(a.length);
		int sizeofarr = a.length;
		
		for(int i=0;i<sizeofarr;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
