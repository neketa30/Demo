package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("neketa");
		hs.add("he");
		hs.add("she");
		hs.add("the");
		hs.add("hreeehe");
      //  System.out.println(hs);
        //System.out.println(hs.size());
       // System.out.println(hs.remove("neketa"));
        //System.out.println(hs);
        
       Iterator<String> s= hs.iterator();
       
       while(s.hasNext())
       {
       System.out.println(s.next());
       
	}

}
}
