package ravi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DisableCookies {

	
	@Test (enabled=false)
	public void firefoxProfileSetupdisableCookies()
	{
	WebDriver driver;
	
		FirefoxProfile profile = new ProfilesIni().getProfile("default");
		profile.setPreference("network.cookie.cookieBehavior", 2);
		System.setProperty("webdriver.gecko.driver","C:\\Users\\TYSS\\Desktop\\resources\\geckodriver.exe");
		  driver=new FirefoxDriver(profile);
		driver.get("https://www.flipkart.com/");
System.out.println("hi");
	}

	@Test(priority=1)
	public void firefoxSetupCookies()
	{
		  DesiredCapabilities cap = DesiredCapabilities.firefox();
		    cap.setCapability("marionette", false);
		    cap.setCapability("firefox_profile", new ProfilesIni().getProfile("default"));

		    FirefoxDriver driver = new FirefoxDriver(cap);
		    
		    driver.get("https://www.flipkart.com/");
	}
	
}
