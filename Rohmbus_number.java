/*
     a 
  a b a 
a b c b a 
  a b a 
    a 

 
 */
package pattern;
public class Rohmbus_number {
public static void main(String[] args) {
		int line=5;
		int space=line/2;
		int star=1;
		for(int i=0;i<line;i++)
		{ 
			//int number =1;
			char number='a';
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
		for(int k=0;k<star;k++)
		{
			if(k<star/2)
			{
				System.out.print(number++ +" ");
				
			}
			else
			{
				System.out.print(number-- +" ");
				
			}
		}
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
		System.out.println();
		}
		
	}

}
