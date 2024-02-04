class I
{
	private I other;
	
	public void other(I i)
	{
		other=i;
	}
}
class J
{
	static int i=0;
	private void m1()
	{
		I i1=new I();
		I i2=new I();
		I i3=new I();
		I i4=new I();
		i1.other(i3);
		i2.other(i1);
		i3.other(i2);
		i4.other(i4);
				
	}
	protected void finalize()
	{
		System.out.println(++i+" Recycled!!");
	}
	public static void main(String args[])
	{
		new J().m1();
		System.gc();
		System.out.println("Success!!");
	}
}
