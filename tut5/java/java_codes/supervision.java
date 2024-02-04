import java.io.*;
class supervision
{
	public static void main(String args[])
	{
		Thread thref=Thread.currentThread();
	
		System.out.println("Current Thread\t"+thref);
			
		thref.setName("This is my thread");

		System.out.println("After name change"+thref);
		
		try
		{
			for(int n=5;n>=1;n--)
			{
				System.out.println(n);
				Thread.sleep(1000);

			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception caught:"+e);
		}
	}
}
