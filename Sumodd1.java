public class Sumodd1
{
	public static void main(String args[])
	{
		int i , s=0;
		for(i=2;i<10;i++)
		{
			if(i%2==0)
			{
			   System.out.println(i);
			   s=s+i;
			}
			
			
		}
		System.out.println("sum of odd number= " +s);
		
	}
}