package ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizeActions {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\TYSS\\Desktop\\resources\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://jqueryui.com/resizable/");
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));



WebElement resizeableElement=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
Thread.sleep(2000);

Point loc=resizeableElement.getLocation();
Actions act=new Actions(driver);
act.clickAndHold(resizeableElement).moveByOffset(100, 120).release().build().perform();
Thread.sleep(3000);

System.out.println(loc);
driver.close();

	}

}
