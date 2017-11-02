package oyorooms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YAX {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='journey-details clearfix']/div[2]/ul/li/input[@placeholder='Select Origin']")).sendKeys("Visakhapatnam, India (VTZ)");
		driver.findElement(By.xpath("//div[@class='journey-details clearfix']/div[2]/ul/li/input[@placeholder='Select Destination']")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Bengaluru']")).click();	

		Thread.sleep(2000);

		WebElement date=driver.findElement(By.xpath("(//tr/td[@title='Sunday, 14 January 2018']/a[@id='a_2018_1_14']/span[.='14'])[1]"));
		System.out.println(date.getText());

		date.click();
		driver.findElement(By.xpath("//li[@id='BE_flight_ret_cal']")).click();
		WebElement returndate=driver.findElement(By.xpath("(//tr/td[@id='td_2018_5_14']/a[@id='a_2018_5_14']/span[.='14'])[1]"));
		System.out.println(returndate.getText());
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",returndate);
		returndate.click();
		WebElement w1=driver.findElement(By.xpath("//div[@class='ripple-parent']"));
		//driver.findElement(By.xpath("//input[@type='submit']")).click();

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",w1);
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.elementToBeClickable(w1));
		w1.click();
		Thread.sleep(4000);
		int length = 0;
		int i = 0;
		while(true)
		{
			

try
{
			((JavascriptExecutor)driver).executeScript("javascript:window.scrollBy(0,3500)");
		// lastflight=driver.findElement(By.xpath("//li/small[.='AI - 776 / 952']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",lastflight);
			List<WebElement> list = driver.findElements(By.xpath("//div[@ng-repeat='flt in fltSeg | limitFromTo:listLength | index track by $index']"));

			length=list.size();
			i++;
}
catch(Exception e)
{
	


		e.printStackTrace();
}


}
	//	System.out.println(length);
		
		
	}
	
}
