package JavaPractice;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {

//wertyuiop[
		//ghfghfghfghfgh
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		a.add(1, "Neketa");
		a.add("manish");
		/*System.out.println(a.get(2));
		System.out.println(a.size());*/
		//System.out.println(a.remove(2));
		System.out.println(a);
		System.out.println(a.indexOf("Neketa"));
		System.out.println(a.contains("Always"));
		System.out.println(a.isEmpty());
		
		int sizeofarr =a.size();
		
		for(int i=0; i<sizeofarr;i++)
		{
			System.out.println(a.get(i));
		}

	}

	}


