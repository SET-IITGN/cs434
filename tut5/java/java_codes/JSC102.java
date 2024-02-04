class SuperClass
{
	private int a;
	
	SuperClass()
	{
		System.out.println("Inside Super Class constructor..");
	}
	int geta()
	{
		return(a);
	}
	void seta(int n)
	{
		a=n;
	}
}
class JSC102 extends SuperClass
{
	public static void main(String args[])
	{
		new JSC102();
	}
}
	
