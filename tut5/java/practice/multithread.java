import java.io.*;
class A extends Thread
{
	A()
	{
		System.out.println("Inside A's constructor");
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A:"+i);
			
			if(i==3)
			{
				yield();
			}
		}
		System.out.println("Out of Thread A");
	}
}
class B extends Thread
{
	B()
	{
		System.out.println("Inside B's constructor");
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B:"+i);
			
			if(i==2)
			{
				stop();
			}
		}
		System.out.println("Out of Thread B");
	}
}
class C extends Thread
{
	C()
	{
		System.out.println("Inside B's constructor");
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
class multithread
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
	
		System.out.println("Started Thread A");
		System.out.println("Started Thread B");
		System.out.println("Started Thread C");
		
		a.start();
		b.start();
		c.start();
	}
}
		
	
		
