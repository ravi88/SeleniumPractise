package oyorooms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import test.dependent.DependentOnMethod1AlwaysRunSampleTest;

public class ParallelExecution {
  @Test
  public void test1() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.yatra.com/");
  }
  
  @Test(dependsOnMethods={"test4"})
  public void test2()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.yatra.com/");
	  
  }
  @Test
  public void test3()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.oyorooms.com/");
	  
  }
  @Test
  public void test4()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.oyorooms.com/");
	  
  }
  
}
