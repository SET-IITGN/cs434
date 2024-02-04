import java.io.*;
class X implements Runnable
{
	Thread x;
	X()
	{
		x=new Thread(this);
		x.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==2)
				Thread.yield();
			System.out.println("Thread X:"+i);
		}
		System.out.println("Exit from X");
	}
}
class Y implements Runnable
{
	Thread y;
	
	Y()
	{
		y=new Thread(this);
		y.start();
	}
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("Thread Y:"+j);
			if(j==3)
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
		System.out.println("Exit from Y");
	}
}
class Z implements Runnable
{
	Thread z;
	Z()
	{
		z=new Thread(this);
		z.start();
	}
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			if(k==1)
				System.out.println("Thread Z:"+k);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception caught:"+e);
			}
		}
		System.out.println("Exit from Z");
	}
}
class stat
{
	public static void main(String args[])
	{
		new X();
		new Y();
		new Z();
		
		System.out.println("Started Thread X");
		System.out.println("Started Thread Y");
		System.out.println("Started Thread Z");
	}
}			
			
