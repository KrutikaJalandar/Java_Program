public class Palindrome1
{
	public static void main(String args[])
   	{
		int  s=0, c;
		int n=Integer.parseInt(args[0]);
		c=n;
		while(n>0)
		{
			c=n%10;
			s=(s*10)+c;
			n=n/10;	
		}
    		if(c==s)
		{
			System.out.println("palindrome number");
		}
  		else
		{
			
			System.out.println("not palindrome number");
		}
		
		
	}
}