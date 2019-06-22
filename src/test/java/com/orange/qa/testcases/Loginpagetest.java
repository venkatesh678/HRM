package com.orange.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.Homepage;
import com.orange.qa.pages.Loginpage;

public class Loginpagetest extends TestBase  {
	

	public Loginpage loginpage;
	public Homepage homepage;
	
 Loginpagetest(){
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
	}
	
	@Test
	public void loginpagetexttest() {
		loginpage.validatehrmheading();
	}
	
	@Test
	public void loginpageTitletest() {
		String title= loginpage.validateloginpagetitle();
		Assert.assertEquals(title,"OrangeHRM");
		
	}
	@Test
	public void logintest() {
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
