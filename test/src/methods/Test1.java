package methods;

public class Test1 {

	public static void main(String[] args) 
	
	{
		//calling static method
		addition();
		//Calling non static method
		Test1 t1= new Test1();
		t1.Subtraction();
		//calling static method from another class
		Test2.Demo1();
		//Calling non static method from another class
		Test2 t2 =new Test2();
		t2.Demo2();
		
		

	}
	public static void addition() 
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	public void Subtraction() 
	{
		int a=15;
		int b=5;
		int sub=a-b;
		System.out.println("Subtraction is "+sub);
	}

}
