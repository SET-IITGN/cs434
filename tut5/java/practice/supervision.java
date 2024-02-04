import java.io.*;
class supervision
{
	public static void main(String args[])
	throws InterruptedException
	{
		Thread x=Thread.currentThread();
		
		System.out.println("Name of Thread:"+x);
		x.setName("Mythread");
		System.out.println("New name of Thread:"+x);

		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			Thread.sleep(1000);
		}
	}
}
					
		
