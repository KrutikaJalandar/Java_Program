public class Armstrong
{
	public static void main(String args[])
   	{
		int  arm=0, rem,c;
		int n=Integer.parseInt(args[0]);
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;	
		}
    		if(c==arm)
		{
			System.out.println("Armstrong number");
		}
  		else
		{
			
			System.out.println("not Armstrong number");
		}
		
		
	}
}