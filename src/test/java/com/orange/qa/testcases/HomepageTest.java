package com.orange.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.Homepage;
import com.orange.qa.pages.Loginpage;

public class HomepageTest extends TestBase{
	public static Loginpage loginpage;
	public static Homepage homepage ;
	
	public HomepageTest() {
		super();
	}
	
	//setup process to reach Homepage
	@BeforeMethod
	public void setup() {
		initialization();
		 loginpage = new Loginpage();
	     homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifylogo() {
		System.out.println("Validated logo: " +homepage.Validatelogo());
 	//homepage.Validatelogo();
 	System.out.println("Validated Adminlinktext: " +homepage.ValidateAdmin());
 	//homepage.ValidateAdmin();
		
	}
	@Test(priority=2)
	public void clickonPimpage() {
		homepage.ValidatePim();
	}
	
	//quits browser
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
