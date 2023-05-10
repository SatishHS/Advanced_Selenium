package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoaderWait 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		try
		{
			driver.get("https://www.flipkart.com/");
			System.out.println("Page is Loaded");
		}
		catch (Exception e)
		{
			System.out.println("Fail: Page is not loaded");
		}
		driver.close();
		

	}

}
