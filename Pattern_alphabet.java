package pattern;

public class Pattern_alphabet {

	public static void main(String[] args)
	{
		int line=5;
	int star=1;
	int space=line-1;
	   char num='a';
	for(int i=0;i<line;i++)
	{ 
	    //char num='a';
		for(int j=0;j<space;j++)
		{
			System.out.print("  ");
		}
		for(int k=0;k<star;k++)
		{
			if(k%2==0)
			{
				System.out.print(num+" ");
				num++;
			}
			else
			{
				System.out.print("* ");
			}
		}
		space--;
		star=star+2;
		System.out.println();

	}
	}
}

