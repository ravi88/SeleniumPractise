package practise_java;

import java.util.Scanner;

public class DecimalToHexa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int copy=number;
		String str=" ";
		char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(number>0)
		{
			int rem=number%16;
			str=hexa[rem]+str;
			number=number/16;
		}
		System.out.println("decial to hexa conversion of  "+copy+" is " +str);

	}

}
