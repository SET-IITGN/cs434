import java.lang.Throwable;
class exception
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside Try Block");
			int a=9,b=0,c;
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero Error!!");
		}
	}
}
