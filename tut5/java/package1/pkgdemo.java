package package1;
class pack
{
	static void meth()
	{
		System.out.println("Inside meth() of class pack");
	}
}
class pkgdemo extends pack
{
	public static void main(String args[])
	{
		System.out.println("Inside main() method..");
		pack.meth();
	}
}	
