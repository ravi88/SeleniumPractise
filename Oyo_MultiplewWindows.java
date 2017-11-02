package oyorooms;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oyo_MultiplewWindows {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
	WebElement wb1=	driver.findElement(By.xpath("//div/a[@title='Download OYO App']"));

		Actions act=new Actions(driver);
		act.moveToElement(wb1).perform();
	act.contextClick(wb1).perform();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	//getting no of window tabs and storing in array list for easy retrival
	//ArrayList<String>al=new ArrayList<String>(driver.getWindowHandles());
//	System.out.println(al.size());
//	driver.switchTo().window(al.get(1));
//	driver.findElement(By.xpath("(//div[@class='contents']/a/img)[2]")).click();
//	
//	  Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
//	System.out.println(cap.getVersion());
//	
//	System.out.println(cap.getPlatform());
	
	 String parent=driver.getWindowHandle();
	 Set<String>set=	driver.getWindowHandles();
	 	
	 	for(String ss:set)
	 	{
	 		driver.switchTo().window(ss);
	 	}
	 	driver.findElement(By.xpath("(//div[@class='contents']/a/img)[2]")).click();
	 	
	 	Set<String>set1=driver.getWindowHandles();
	 	for(String x:set1)
	 	{
	 		driver.switchTo().window(x);
	 	}
WebElement wb2=driver.findElement(By.xpath("//ul/li/a[@href='/apps']"));
Actions act1=new Actions(driver);
act1.contextClick(wb2).perform();

Robot r1=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
Set<String>set2=driver.getWindowHandles();
for(String y:set2)
{
	driver.switchTo().window(y);
}

driver.switchTo().window(parent);
driver.close();
}
	 	
		
		
		
	}


