package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider 
{
	@DataProvider
	public Object getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]="abc";
		obj[0][1]="xyz";
		
		obj[1][0]="123";
		obj[1][1]="456";
		
		obj[2][0]="ab2";
		obj[2][1]="000";
		return obj;
		
	}
	
	@Test (dataProvider = "getData")
	public void login(String username, String password) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		
		
		
		
	}

}
