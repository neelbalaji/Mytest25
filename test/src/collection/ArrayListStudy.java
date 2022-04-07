package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		al.add("Balaji");
		al.add("Mahavir");
		al.add("Neel");
		al.add(7020954201l);
		System.out.println(al);
		boolean a = al.isEmpty();
		System.out.println(a);
		boolean b = al.contains("Balaji");
		System.out.println(b);
		al.add("Sawaleshwar");
		System.out.println(al);
		al.add(3, "Solapur");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Balaji"));
		System.out.println("===========Using for loop========= ");
		for(int i=0;i<=al.size()-1;i++)// using for loop
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========Using Iterator========= ");
		Iterator it=al.iterator();// using iterator
				while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
				
			System.out.println("===========Using for each loop========= ");
				
			for(Object o:al)
			{
				System.out.println(o);
			}
			System.out.println("====================================== ");
			ArrayList<Integer>in= new ArrayList<>();
			in.add(11111);
			in.add(22222);
			in.add(33333);
			in.add(44444);
			
			System.out.println(in);
			
			for(int i:in)
			{
				System.out.println(i);
			}
			
			Iterator<Integer>in1=in.iterator();
			
			while (in1.hasNext())
			{
				System.out.println(in1.next());
			}

	}

}
