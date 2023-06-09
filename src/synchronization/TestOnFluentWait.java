package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class TestOnFluentWait 
{
	public static void main(String[] args) 
	{

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				FluentWait wait = new FluentWait(driver);
				wait.withTimeout(Duration.ofSeconds(10));
				wait.pollingEvery(Duration.ofSeconds(5));
				wait.ignoring(NoSuchElementException.class);
				
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9632279969");
				driver.close();
				

			}

}
