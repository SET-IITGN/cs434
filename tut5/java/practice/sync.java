import java.io.*;
import java.util.*;
class ext
{
	synchronized public void display(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught:"+e);
		}
		System.out.println("]");
	}
}
class extcall implements Runnable
{
	ext tt;
	String s;
	Thread t;
	
	extcall(ext obj,String k)
	{
		this.s=k;
		tt=obj;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		tt.display(s);
	}
}
class sync 
{
	public static void main(String args[])
	{
		ext ex=new ext();
		extcall th1=new extcall(ex,"Shouvick");
		extcall th2=new extcall(ex,"Mondal");
		extcall th3=new extcall(ex,"Batsman");

		try
		{
			th1.t.join();
			th2.t.join();
			th3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught:"+e);
		}
	}
}
				
				
			
		
