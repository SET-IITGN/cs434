import java.io.*;
class X extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)
				yield();
			System.out.println("Thread X:"+i);
		}
		System.out.println("Exit from X");
	}
}
class Y extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("Thread Y:"+j);
			if(j==3)
				stop();
		}
		System.out.println("Exit from Y");
	}
}
class Z extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			
			if(k==1)
				System.out.println("Thread Z:"+k);
			try
			{
				sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception caught:"+e);
			}
		}
		System.out.println("Exit from Z");
	}
}
class multithread
{
	public static void main(String args[])
	{
		X th1=new X();
		Y th2=new Y();
		Z th3=new Z();
		
		System.out.println("Started Thread X");
		th1.start();
		
		System.out.println("Started Thread Y");
		th2.start();
		
		System.out.println("Started Thread Z");
		th3.start();
	}
}

				
			
