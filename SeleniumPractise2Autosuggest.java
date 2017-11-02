package oyorooms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractise2Autosuggest {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
WebElement searchbar=driver.findElement(By.xpath("//div[@class='sfsbc']"));
Actions act=new Actions(driver);
act.moveToElement(searchbar).sendKeys("selenium").perform();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='sbqs_c']/b)[3]")).click();

//selecting Selenium interview Questions from drop down
System.out.println(driver.getTitle());
	}

}
