package exceptions;

public class Arithmatic {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		String a1="Balaji";

			
		try {
			int div=a/b;
			
			System.out.println(div);
			
		} catch (ArithmeticException e) 
		{
			System.out.println("Cannot divided by zero");
		}
		try 
		{
			System.out.println(a1.charAt(6));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Enter argument between 0-5");
		}
		System.out.println(a1.charAt(3));
	

	}

}
