class x 
{
	int x=5;

	public void meth()
	{
		System.out.println("Inside x's meth()");
	}
}
class y extends x
{
	int x=9;
	
	public void meth()
	{
		System.out.println("Inside y's meth()");
	}
}
class dynamic
{
	public static void main(String args[])
	{
		x obj=new y();
		obj.meth();
		System.out.println("x="+obj.x);
		obj=new x();	
		obj.meth();
		System.out.println("x="+obj.x);	
		System.out.println("x="+new y().x);
			
	}
}

