package pattern;

public class Rhombus_alphabet {

	public static void main(String[] args) 
	{
		int line=5;
		int space=line/2;
		int star=1;
		for(int i=0;i<line;i++)
		{
		for(int j=0;j<space;j++)
		{
		System.out.print("  ");	
		
		}
		for(int k=0;k<star;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
		if(i<line/2)
		{
			space--;
			star=star+2;
		}
		else
		{
	space++;
	star=star-2;
		}
		}
		}
	    }
