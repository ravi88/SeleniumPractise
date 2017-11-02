package practise_java;

public class I1 {

	public static void main(String[] args)
	{int n=10;
		int a[]={1,2,6,8,9};
		for(int i=0;i<n;i++)
		{
			if(i!=a[n])
			{System.out.println(i);
				continue;
			}
			System.out.println(i);
		}
		
	}

}
