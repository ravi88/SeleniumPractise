package ravi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametization {
	@Parameters({"browsername"})
	@Test 
		public void test1(String browsername)
		
		{
		System.out.println("browser value passed is ----> " + browsername);
		
		}
	
	@Parameters({"username","password"})
	@Test
	public void test2(String username, String password)
	{
		System.out.println("username passed is ----->" + username );
		System.out.println("password passsed is ---->" + password);
	}

}
