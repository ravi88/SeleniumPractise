package oyorooms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SeleniumPractise {

	public static void main(String[] args)
	
	{ 
		String expectedcontinentname="Australia";
		System.setProperty("webdriver.chrome.driver", "C:\\ravi_work\\oyorooms\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement selectBox =driver.findElement(By.xpath("//select[@id='continents']"));
		
Select s=new Select(selectBox);
List<WebElement> listofcountries=s.getOptions();
System.out.println("number of continents "+listofcountries.size());
s.selectByIndex(3);
for(WebElement wb:listofcountries)
{
		System.out.println(wb.getText());

}
WebElement selectedcontinent=s.getFirstSelectedOption();
String selectedcontinentName=selectedcontinent.getText();
System.out.println("selectedcontinent name  "+selectedcontinentName);
Assert.assertEquals(selectedcontinentName, expectedcontinentname);
System.out.println("verifired selected continent");

	}

}
