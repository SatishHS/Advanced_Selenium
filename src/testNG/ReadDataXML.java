package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataXML 
{
	@Test 
	public void login(XmlTest xml)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(xml.getParameter("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(xml.getParameter("UN"));
		driver.findElement(By.name("pwd")).sendKeys(xml.getParameter("PWD"));
	}

}
