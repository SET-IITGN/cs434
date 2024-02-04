import java.io.*;
import java.util.*;
class StringSplitter
{	
	synchronized public void display(String s)
	{
		int i;
		char ch;
		String h=" ";
		for(i=0;i<s.length();i++)
		{
			h+=" ";
			ch=s.charAt(i);
			System.out.println(h+ch);
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
}
class thread extends Thread
{
	StringSplitter ss;
	String s;
	
	thread(StringSplitter k,String n)
	{
		ss=k;
		this.s=n;
	}
	public void run()
	{
		ss.display(s);
	}
}
class app
{
	public static void main(String args[])
	{
		StringSplitter m=new StringSplitter();
		thread t1=new thread(m,"Shouvick");
		thread t2=new thread(m,"Projjwal");
		thread t3=new thread(m,"Gourab");
			
		t1.start();
		t2.start();
		t3.start();
	
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
		}
	}
}
					
	
	
			

