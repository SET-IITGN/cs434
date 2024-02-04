abstract class abs
{
	int a;
	abstract public void meth(int i);
	abstract public void meth2(int j);
	abstract public void meth3(int k);
}
class abs2 extends abs
{
	public void meth(int i)
	{
		a=i;
		System.out.println("a initialized through meth() a="+a);
	}
	public void meth2(int j)
        {
                a=j;
                System.out.println("a initialized through meth2() a="+a);
        }
        public void meth3(int k)
        {
                a=k;
                System.out.println("a initialized through meth3() a="+a);
        }
}
class abstractdemo
{
	public static void main(String args[])
	{
		
		abs2 ob=new abs2();
		
		ob.meth(1);
		ob.meth2(2);
		ob.meth3(3);
	
	}
}
	
