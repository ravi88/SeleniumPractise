package practise_java;

public class Strong_Number {

	public static void main(String[] args) {
	int number =145;
	int res;
    int sum=0;
	int copy=number;
	while(number>0)
	{
		int rem=number%10;
		 res=fact(rem);
		 sum=sum+res;
		 number=number/10;		
	}
	//System.out.println(sum);
	String msg=copy==sum?copy+" strong number":copy+" not strong number";
	System.out.println(msg);
	}

	
	public static int fact(int i)
{ 
	int fact=1;
	while(i>0)
	{
		fact=fact*i;
		i--;
		
	}
	return fact;
	
}
}
