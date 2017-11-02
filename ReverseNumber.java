package arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int rev=0;
		int copy=number;
		while(number>0)
		{
			int rem=number%10;
			 rev=rev*10+rem;
			 number =number/10;
		}
		
if(copy==rev)
{
	System.out.println(rev + " is palindrome");
}
else{
	System.out.println(rev +" is not palindrome");
}
	}
	
}
