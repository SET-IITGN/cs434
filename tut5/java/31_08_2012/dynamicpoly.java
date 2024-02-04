class A
{
	A()
	{
		System.out.println("Inside A's constructor");
	}
	public void meth()
	{
		System.out.println("Original meth() in A");
	} 
}
class B extends A
{
	B()
	{
		System.out.println("Inside B's constructor");
	}
	public void meth()	
	{
		System.out.println("Overridden meth() in B");
	}
}
class C extends B
{
	
	C()
	{
		System.out.println("Inside C's Constructor");
	}
	public void meth(int x)
	{
		System.out.println("Overloaded meth() in C");
	}
}	
class dynamicpoly
{
	public static void main(String args[])
	{
		
		A r;
		r=new A();
		r.meth();
		
		r=new B();
		r.meth();
		
		r=new C();
		r.meth();
		
		C y=new C();
		y.meth();
		y.meth(7);
		
	}
}
		
