package practise_java;

public class PerfectNumber {

	public static void main(String[] args) 
	{
	
	for(int i=1;i<100;i++)
	{
		int number=i;
		int sum=0;
		for(int j=1;j<=number/2;j++)
		{
			if(number/i==0)
			{
				sum=sum+i;
			}
		}
	if(sum==number)
	{
		System.out.println(number +" is pefect number");
	}
	}

	}

}
