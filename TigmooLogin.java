package oyorooms;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TigmooLogin {


	@Test
	public void LoginTigmoo() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tigmoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='header-right']/div/ul/li[4]")).click();
		
String	username	=ExcelUtility.getData( "Sheet1",1,0);
String	password	=ExcelUtility.getData( "Sheet1",1,1);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
driver.findElement(By.xpath("//button[.='Login']")).submit();
driver.findElement(By.xpath("//a[@class='logo']/img")).click();
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("phone");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='search_autocomplete_list']/ul/li[4]/a")).click();

driver.findElement(By.xpath("//a[@id='yt_popup']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//ul/li[5]/a[@class='btnClose']")).click();
	}

}
