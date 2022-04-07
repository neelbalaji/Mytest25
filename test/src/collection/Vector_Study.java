package collection;

import java.security.DrbgParameters.NextBytes;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Balaji");
		v.add(123);
		v.add("Balaji");
		v.add(null);
		v.add(true);
		v.add(null);
		System.out.println(v);
		for(Object o:v) 
		{
			System.out.println(o);
		}
		System.out.println("************By using for each*******************");
		Iterator vv = v.iterator();
		while(vv.hasNext()) 
		{
			System.out.println(vv.next());
		}
		System.out.println("************By using while(Listiterator) *******************");
		ListIterator v1 = v.listIterator();
		while(v1.hasNext()) 
		{
			System.out.println(v1.next());
			
			System.out.println("================By Using for loop=============");
			for(int i=0;i<=v.size()-1;i++) 
			{
				System.out.println(v.get(i));
			}
			System.out.println("***********************************");
			Enumeration em =v.elements();
			while (em.hasMoreElements()) {
				System.out.println(em.nextElement());
				
			}
		}

	}

}
