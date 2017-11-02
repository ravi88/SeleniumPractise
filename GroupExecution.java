package oyorooms;

import org.testng.annotations.Test;

public class GroupExecution {
  @Test(groups={"smoketest"})
  public void test1() 
  {
	  System.out.println("test1 belongs to smoke test");
  }
  @Test(groups={"Regressiontest"})
  public void test2()
  
  {
	  System.out.println("test2 belongs to Regression test");
	  
  }
  @Test(groups={"integration test"})
  public void test3()
  {
	  System.out.println("test3 belongs to integration test");
  }
  @Test(groups={"smoketest"})
  public void test4()
  {
	  System.out.println("test4 belongs to smoke test");
  }
   
}
