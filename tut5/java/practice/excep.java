import java.io.*;
class myException extends Exception
{
	public String toString()
	{
		return("My custom exception");
	}
}
class excess
{
	public void meth()throws myException
	{	
		throw new myException();
	}
}
class excep
{
	public static void main(String args[])
	{
		try
		{
			new excess().meth();
		}
		catch(myException e)
		{
			System.out.println("Exception Caught:"+e);
		}
	}
}
