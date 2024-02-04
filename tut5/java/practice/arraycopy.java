class arraycopy
{
	public static void main(String args[])
	{
		int ar[]={1,2,3,4,5,6,7,8,9,10};
		int br[]=new int[ar.length];
	
		System.arraycopy(ar,2,br,0,4);

		for(int i=0;i<br.length;i++)
		{
			System.out.println("br["+i+"]:"+br[i]);
		}
	}
}
	
