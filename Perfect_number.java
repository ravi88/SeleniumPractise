package practise_java;

public class Perfect_number {

	public static void main(String[] args) 
	{
		int number=153;
		int copy=number;
		int sum=0;
		int value=1;
		while(value<=number/2)
		{
			if(number%value==0)
			{
				sum=sum+value;
			}
		value++;
		}
	
//System.out.println(sum);
String msg=copy==sum?copy+" is Perfect Number":copy+" is not perfect number";
System.out.println(msg);
	}

}
