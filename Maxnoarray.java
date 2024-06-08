public class Maxnoarray
{
	public static void main(String args[])
	{
	  	int a[]=new int[10];
	  	for(int i=0;i<a.length;i++)
	  	{
			a[i]=Integer.parseInt(args[i]);
         	}	
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		System.out.println("maximum number is" +max);
	}
}