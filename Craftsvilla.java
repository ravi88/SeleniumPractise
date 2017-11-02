package oyorooms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Craftsvilla {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.craftsvilla.com/");
		driver.findElement(By.xpath("//a[@href='http://www.craftsvilla.com/cvfeeds/trending-ss?MID=Normal_Trending Salwar Suits_2_5590_1']")).click();
		driver.findElement(By.xpath("//img[@src='http://img.craftsvilla.com/image/upload/w_272,h_400,c_lfill,f_auto,q_auto,fl_lossy,e_sharpen/C/V/CV-35882-MCRAF25565086590-1505805544-Craftsvilla_1.jpg']")).click();
		
//		List<WebElement> countries=driver.findElements(By.xpath("//div[@id='country']/div/div/ul/li"));
//	System.out.println(countries.size());
		
	}

}
