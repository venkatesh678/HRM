package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class Loginpage extends TestBase {

	public Loginpage() {
		//initialising page objects
	PageFactory.initElements(driver, this);
	}
	//Object Repository
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[(@id='logInPanelHeading')]")
	WebElement Heading;
	
	//Actions
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public boolean validatehrmheading() {
	return	Heading.isDisplayed();
	}
	
	public Homepage login(String un,String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		
		return new Homepage();
	}
}
