package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("balaji");
	ll.add("neel");
	ll.add("snehal");
	ll.add(2525);
	ll.add(null);
	ll.add("snehal");
	ll.add(null);
	System.out.println(ll.get(0));
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println(ll.isEmpty());
	System.out.println("==========by using for loop==============");
	for(int i=0; i<=ll.size()-1;i++) 
	{
		System.out.println(ll.get(i));
	}
	System.out.println("==========by using itrator==============");
	Iterator li = ll.iterator();
	while(li.hasNext()) 
	{
		System.out.println(li.next());
	}
	System.out.println("==========by using for each==============");
	
	for(Object o:ll) 
	{
		System.out.println(o);
	}
	
	
	
	
	
	
	
	

	}

}
