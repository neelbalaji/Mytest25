package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet<>();
		hs.add("Solapur");
		hs.add("Pune");
		hs.add(null);
		hs.add("Satara");
		hs.add("Solapur");
		hs.add(15);
		hs.add(null);
		System.out.println(hs);
		
		for(Object o:hs) 
		{
			System.out.println(o);
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println(hs.contains(null));
		System.out.println(hs.isEmpty());
		hs.remove(15);
		System.out.println(hs);
		
		
		
		

	}

}
