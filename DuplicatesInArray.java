package arrays;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		sc.close();
		char a[]=s.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
		int	count=1;
		int	count1=0;
		for(int j=0;j<=i-1;j++)	
		{
		if(a[i]==a[j])
		{
			count1++;
		}
		}
		if(count1==0)
		{
			for(int k=i+1;k<=a.length-1;k++)
			{
				if(a[i]==a[k])
				{
					count++;
				}
			}
		if(count>1)
		{
			System.out.println(a[i] +" present " +count+" times");
		}
		}
			
		}

}}