public class Divide
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		if(num%3==0  &&  num%7==0)
		{
			System.out.println("the number is divisible by both 3 and 7");
		}
		else
		{
			System.out.println("the number is not divisible by both 3 and 7");
		}
	}
}