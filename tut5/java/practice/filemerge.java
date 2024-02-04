import java.io.*;
import java.util.*;
class filemerge
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream f1=new FileInputStream("filter.java");
			FileInputStream f2=new FileInputStream("bank.java");
			SequenceInputStream ss=new SequenceInputStream(f1,f2);
			BufferedInputStream bi=new BufferedInputStream(ss);
			BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("merged.txt"));

			int ch=0;
			
			while((ch=bi.read())!=-1)
			{
				bo.write(ch);
				System.out.print((char)ch);
			}
			bo.close();
			bi.close();
			ss.close();
			f2.close();
			f1.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
		}
		
	}
}	
			
			
