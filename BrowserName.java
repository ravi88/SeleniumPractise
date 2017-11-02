package ravi;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class BrowserName {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TYSS\\Desktop\\resources\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		  Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
		  String Browsername=cap.getBrowserName();
		 
		  System.out.println(Browsername);
	
		  System.out.println(cap.getPlatform()); 
		System.out.println(cap.getVersion());
		driver.close();

	}

}
