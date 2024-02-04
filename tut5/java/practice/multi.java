import java.io.*;
import java.util.*;
class A implements Runnable
{
	Thread x;
	
	A()
	{
		x=new Thread(this);
		x.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A:"+i);
			
			if(i==3)
			{
				Thread.yield();
			}
		}
		System.out.println("Out of Thread A");
	}
}
class B implements Runnable
{
	Thread y;
		
	B()
	{
		y=new Thread(this);
		y.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B:"+i);
			
			if(i==2)
			{
				Thread.yield();
			}
		}
		System.out.println("Out of Thread B");
	}
}
class C implements Runnable
{
	Thread z;
	
	C()
	{
		z=new Thread(this);
		z.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B:"+i);
			
			if(i==4)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Exception Caught:"+e);
				}
			}
		}
		System.out.println("Out of Thread C");
	}
}
class multi
{
	public static void main(String args[])
	{
		new A();
		new B();
		new C();
		
		System.out.println("Started Thread A");
		System.out.println("Started Thread B");
		System.out.println("Started Thread C");
	}	
}

		

	

