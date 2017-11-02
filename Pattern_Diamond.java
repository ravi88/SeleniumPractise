/*
 
  *
 ***
*****
 ***
  *

 */

package pattern;
public class Pattern_Diamond {

	public static void main(String[] args) {
		int line=5;
		int star=1;
		int space=line/2;
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
		    	if(i<line/2)
		    	{
		    		star=star+2;
		    		space--;
		    	}
		    	
		      
		    	else{
		    	
			    space++;
			    star=star-2;
		    		}
		    System.out.println();
		}
		}
		}

	


