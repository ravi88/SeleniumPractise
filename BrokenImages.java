package ravi;

import java.util.List;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrokenImages {
	static int count=0;
	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\TYSS\\Desktop\\resources\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
//BrokenImages b=new BrokenImages();
driver.manage().window().maximize();
List<WebElement>lst=driver.findElements(By.tagName("img"));
System.out.println(lst.size());

for(WebElement imageElement:lst)
	
{
	if(imageElement!=null);
	
	{
		validateImage(imageElement);
	}
}
System.out.println("count of broken images" + count );
	
driver.close();
	
	}
	
public static void validateImage(WebElement imageElement) 
{
	try
	{
	
	HttpClient client=  HttpClientBuilder.create().build();
	String surl=null;
 surl = imageElement.getAttribute("src");
	
	if(surl.startsWith("https"))
	{

	
		
	HttpGet request=new HttpGet(surl);
	
		HttpResponse response =client.execute(request);
		if(response.getStatusLine().getStatusCode()!=200)
		{
			count++;
		}
	} }
	catch (Exception e) {
		
		e.printStackTrace();
	}
}
}