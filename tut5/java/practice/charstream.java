import java.io.*;
class charstream
{
	public static void main(String args[])
	{
		BufferedReader br=null;
		BufferedWriter bw=null;

		try
		{
			br=new BufferedReader(new FileReader("bank.java"));
			bw=new BufferedWriter(new FileWriter("backup.txt"));
			
			String s=null;
	
			while((s=br.readLine())!=null)
			{
				bw.write(s+"\n");
				System.out.println(s);
			}
			bw.close();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
		}
	}
}
