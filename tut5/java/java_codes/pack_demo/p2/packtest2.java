package p2;
import p1.testpack;
public class packtest2
{
	public static void main(String args[])
	{
		int a;
		
		testpack pkg=new testpack();
		a=10;		
		
		pkg.setval(a);
		pkg.getval();
	}
}
