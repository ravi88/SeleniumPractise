package practise_java;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");         
		int number=sc.nextInt();                             //153 is arm strong number.
		int copy=number;
		int pow=power(number);
int sum=0;
		
while(number>0)
{ 
	int base=number%10;
	sum=sum+Base(base,pow);
	number =number/10;
}
		System.out.println(sum);
		String msg=sum==copy?copy+ "  is armstrong":copy+" is not armstrong";
		System.out.println(msg);	
	}
	
public static int Base(int base,int power) //power of base
{
	int res=1;
	for(int i=1;i<=power;i++)
	{
		res=res*base;
		
	}
	return res;
	
}

	public static int power(int number)//number of digit present in the digit
{ 
	int count =0;
	while(number>0)
	{
	number =number/10;	
	count++;
		
	}
	return count;
	
}

}

