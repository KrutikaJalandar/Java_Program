public class Sortarray1
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			
		}
		System.out.println("original array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		for(int i=0;i<a.length;i++)
		{
		 	for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("sorted elements in array in descending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ "  ");
		}
}
}