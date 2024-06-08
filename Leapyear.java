public class Leapyear
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		if(n%4==0 )
		{
			System.out.println("It is a leaf year");
		}
		else
		{
			System.out.println("It is not leaf year");
		}
	}
}