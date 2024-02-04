class Outer
{
	int x=10;
	
	public void outermeth()
	{
		System.out.println(x);
		Inner obj=new Inner();
		obj.innermeth();
	}		
	class Inner
	{
		int a=78;
		
		public void innermeth()
		{
			System.out.println(a);
			System.out.println(x);
		}
	}
}
class Innerdemo
{
	public static void main(String args[])
	{
		Outer x=new Outer();
		x.outermeth();
	}
}
