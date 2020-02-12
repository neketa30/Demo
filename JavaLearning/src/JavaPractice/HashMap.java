package JavaPractice;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
	java.util.HashMap<Integer,String> hs= new java.util.HashMap<Integer, String>();
	hs.put(0, "Neketa");
	hs.put(1, "Neketa");
	hs.put(2, "Neketa");
	hs.put(3, "Neketa");
	hs.put(4, "Neketa");
	System.out.println(hs.get(2));
	
	System.out.println(hs.entrySet());
	
	Set  sm= hs.entrySet();
	
	Iterator<String> tn= sm.iterator();
	
	while(tn.hasNext())
	{
		Entry mp =<Mapentry>tn.next();
	}
	
		
		

	}

}
