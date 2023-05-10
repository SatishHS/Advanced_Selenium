package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGgroups 
{
	@BeforeMethod(groups="create")
	public void login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod(groups="create")
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	
	@Test(groups="create")
	public void createuser()
	{
		Reporter.log("createuser",true);
	}
	
	@Test
	public void deleteuser()
	{
		Reporter.log("deleteuser",true);
	}
	
	@Test(groups="create")
	public void createproject()
	{
		Reporter.log("createproject",true);
	}
	
	@Test
	public void deleteproject()
	{
		Reporter.log("deleteproject",true);
	}
	
	

}
