import java.io.*;
class filter implements FilenameFilter
{
	String s;
	
	filter(String g)
	{
		this.s=g;
	}
	public boolean accept(File d,String k)
	{
		return k.endsWith(s);
	}	
}
class file
{
	public static void main(String args[])
	{
		File d=new File("/usr/include");

		FilenameFilter ff=new filter(args[0]);	

		String s[]=d.list(ff);

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
