class Super
{
	private int a;
	Super()
	{
		System.out.println("Inside Super Class Constructor..");
	}
	public void meth(int k)
	{
		a=k;
		System.out.println("Inside meth...Initialized a="+a);
	}
}
class Sub extends Super
{
	
	static int meth2(int i)
	{
		System.out.println("Inside meth2...i="+i);
		return(i*i);
	}
	
}
class inherit
{
	public static void main(String args[])
	{
		Super ob=new Super();
		ob.meth(7);
		System.out.println("Squared Value="+Sub.meth2(7));
	}
}
