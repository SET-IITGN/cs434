import java.util.*;
class showroom
{
	float dis,net;
	
	public void get_discount(float pur,int type)
	{
		switch(type)
		{
			case 1:
				if(pur>0&&pur<=100)
				{
					dis=0f;
				}
				else if(pur>100&&pur<=200)
				{
					dis=0.05f;
				}
				else if(pur>200&&pur<=300)
				{
					dis=0.075f;
				}
				else if(pur>300)
				{
					dis=0.1f;
				}
				break;

			case 2: if(pur>0&&pur<=100)
				{
					dis=0.05f;
				}
				else if(pur>100&&pur<=200)
				{
					dis=0.075f;
				}
				else if(pur>200&&pur<300)
				{
					dis=0.1f;
				}
				else if(pur>300)
				{
					dis=0.15f;
				}
				break;

			default:
				System.out.println("Invalid choice");
		}
		net=pur-(dis*pur);
		System.out.println("Please pay "+net+" INR");
	}
}
class cloth
{
	public static void main(String args[])
	{
		float pur,net;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the purchase amount:");
		pur=sc.nextFloat();

		System.out.println("Menu");
		System.out.println("1.Mill Cloth");
		System.out.println("2.Hand loom");
		System.out.print("Enter what you have purchased:");
		ch=sc.nextInt();
		showroom obj1=new showroom();
		obj1.get_discount(pur,ch);
	}
}		
