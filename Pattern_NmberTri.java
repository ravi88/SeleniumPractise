 /*
   * * * * * * * 
     * * * * * 
       * * * 
         * 
  	  
 */

package pattern;                                                      
public class Pattern_NmberTri                                                  
{

public static void main(String[] args)
{
	int number=1;
int line=7;
int space=0;
int star=7;
for(int i=0;i<line;i++)
{
	
for(int j=0;j<space;j++)
{
System.out.print(" ");
//number++;
}
for(int k=0;k<star;k++)
{

System.out.print(number+" ");
}
System.out.println();
line--;
star=star-2;
space=space+2;
number++;
}

}
}