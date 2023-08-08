

public class BSort 
{
	public static void sort(int a[])
	{
		int flag;
		for(int i=0;i<a.length-1;i++)
		{
			 flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
				   int t=a[j+1];
				   a[j+1]=a[j];
				   a[j]=t;
				   flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {32,5,67,4,85};
		sort(a);
		for(int k:a)
		{
			System.out.print(k + " ");
		}
		

	}

}
