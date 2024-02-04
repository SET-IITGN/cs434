import java.io.*;
class filemerge
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream f1=new FileInputStream("bank.java");
			FileInputStream f2=new FileInputStream("cone.java");
			FileOutputStream fout=new FileOutputStream("result.txt");
		
			SequenceInputStream si=new SequenceInputStream(f1,f2);
		
			BufferedInputStream bi=new BufferedInputStream(si);
			BufferedOutputStream bo=new BufferedOutputStream(fout);

			int ch;
	
			while((ch=bi.read())!=-1)
			{
				bo.write(ch);
				System.out.print((char)ch);
			}
			f1.close();
			f2.close();
			bo.close();
			si.close();
			bi.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}
}
		
		
			
