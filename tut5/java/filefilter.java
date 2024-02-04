import java.io.*;
class Ext implements FilenameFilter
{
	String s;
	
	Ext(String a)
	{
		this.s=a;
	}
	public boolean accept(File dr,String name)
	{
		return name.endsWith(s);
	}
}		
class filefilter
{
	public static void main(String args[])
	{
		String d="/home/Shouvick/Programming/Java";
		
		File f1=new File(d);
		
		try
		{
			FilenameFilter ff=new Ext(args[0]);
		
			String ss[]=f1.list(ff);

			for(int i=0;i<ss.length;i++)
			{
				System.out.println(ss[i]);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
		}
	}
}	
			
