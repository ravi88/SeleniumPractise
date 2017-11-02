package oyorooms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IbiboHotels {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gosuggest_inputL']")).sendKeys("Vis");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	String title=	driver.getTitle();
System.out.println(title);
Thread.sleep(2000);
driver.findElement(By.xpath("(//i[@class='icon-calendar1 black ico22 fl padB1 lh1-2 padR5'])[1]")).click();
Thread.sleep(2000);
while(true)
try
{
	
	
	driver.findElement(By.xpath("//div[@class='DayPicker-Day' and text()='3']")).click();
	break;
	
	
}
catch(Exception e)
{
	driver.findElement(By.xpath("//div[@class='DayPicker DayPicker--en']/div/span[2]")).click();
	
	
	
	
}

driver.findElement(By.xpath(("(//i[@class='icon-calendar1 black ico22 fl padB1 lh1-2 padR5'])[2]"))).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='DayPicker-Day' and text()='29']")).click();

}

//	driver.close();
		

	}


