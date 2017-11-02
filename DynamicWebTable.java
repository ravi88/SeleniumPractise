package ravi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TYSS\\Desktop\\resources\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("ravindra.reddy619" ,Keys.ENTER);
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Murali88" ,Keys.ENTER); 
WebElement wb=	   driver.findElement(By.xpath("//div[@id=':2k']"));
Actions act= new Actions(driver);
act.moveToElement(wb).click().perform();

// clicking on select  box which has subj as FREECHARGE,3 matching found,	    
List<WebElement>  Matchingfound=driver.findElements(By.xpath("(//div/span[text()='FreeCharge'][1]/../../../td[2])"));
System.out.println(Matchingfound.size());
//clicking on last mail
driver.findElement(By.xpath("(//div/span[text()='FreeCharge'][1]/../../../td[2])[last()]")).click();

String color=driver.findElement(By.xpath("(//div/span[text()='FreeCharge'][1]/../../../td[2])[last()]")).getCssValue("color").toString();
System.out.println(color);
//String sss=driver.findElement(By.xpath("(//div/span[text()='FreeCharge'][1]/../../../td[2])[last()]")).getCssValue("font");
//System.out.println(sss);
//
//String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
//int number1=Integer.parseInt(numbers[0]);
//numbers[1] = numbers[1].trim();
//int number2=Integer.parseInt(numbers[1]);
//numbers[2] = numbers[2].trim();
//int number3=Integer.parseInt(numbers[2]);
//String hex = String.format("#%02x%02x%02x", number1,number2,number3);
//System.out.println(hex);
driver.close();
	 
	
	}
	

}
