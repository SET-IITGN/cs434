class garbage
{
	static int i=1;
	
	public void finalize()
	{
		System.out.println("Garbage Collected from object"+i);
		i++;
	}
	public static void main(String args[])	
	{
		garbage g1=new garbage();
		garbage g2=new garbage();
		garbage g3=new garbage();
		g1=null;
		g2=null;
		g3=null;
		System.gc();
	}
}	
		
