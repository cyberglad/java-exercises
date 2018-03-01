 class MyException extends RuntimeException {}

public class Test72 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
			method1();
		
			method1();
		}
		catch(MyException ne)
		{
			System.out.println("A");
		}
		 
	}
	public static void method1()
	{
		try
		{
			throw Math.random()>0.5? new MyException():new RuntimeException();
		}
		catch(RuntimeException re)
		{
			System.out.println("B");
		}
	}
}
