package oyorooms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatraaaa {
	

		
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.yatra.com/");
			
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
			driver.findElement(By.id("BE_flight_flsearch_btn")).submit();
	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			for(int i=0;i<15;i++)
			{
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			 Thread.sleep(1000);
			}
			
			
			java.util.List<WebElement> myResult = driver.findElements(By.xpath("//div[@class='results spr-push']//div/ul"));
			
			System.out.println(myResult.size());
		}

	


	}


