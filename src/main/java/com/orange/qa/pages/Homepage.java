package com.orange.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class Homepage extends TestBase {
	
	//pagefactory initialization
	public Homepage() {
		
		PageFactory.initElements(driver , this);
	}
	
	//Object Repository

	@FindBy(xpath="//img[contains(@src,'/webres_5cfea87b4387f2.35910947/themes/default/images/logo.png')]")
	WebElement Orangelogo;
	

	@FindBy(xpath="//a[@class='firstLevelMenu']")
	WebElement Adminlink;
	

	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
	WebElement Pimlink;
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	WebElement Leavelink;
	

	@FindBy(xpath="//a[@id='menu_time_viewTimeModule'] ")
	WebElement Timelink;

	@FindBy(xpath="//a[@id='menu_recruitment_viewRecruitmentModule']")
	WebElement Recruitmentlink;

	@FindBy(xpath="a[@id='menu__Performance']")
	WebElement Performanceslink;

	@FindBy(xpath="a[@id='menu_directory_viewDirectory']")
	WebElement Directorylink;

	@FindBy(xpath="//a[@id='menu_maintenance_purgeEmployee']")
	WebElement Maintenancelink;

	@FindBy(xpath="//a[contains(@id,'welcome')]")
	WebElement Welcomeadminlink;

	@FindBy(xpath="//input[contains(@id,'MP_link')]")
	WebElement Marketplacelink;

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement Headertext;

	@FindBy(xpath="//img[contains(@src,'/webres_5cfea87b4387f2.35910947/orangehrmLeavePlugin/images/ApplyLeave.png')]")
	WebElement Applyleavelink;

	@FindBy(xpath="//img[contains(@src,'/webres_5cfea87b4387f2.35910947/orangehrmLeavePlugin/images/MyLeave.png')]")
	WebElement leavelistlink;

	@FindBy(xpath="//img[contains(@src,'/webres_5cfea87b4387f2.35910947/orangehrmTimePlugin/images/MyTimesheet.png')]")
	WebElement Timesheetlink;
	
   //ACTIONS
	
	public String ValidateHomepagetitle() 
	{
		return driver.getTitle();
	}
	
	public boolean Validatelogo() 
	{
		return Orangelogo.isDisplayed();
	}
	
	public boolean ValidateAdmin()
	{
		return Adminlink.isDisplayed();
	}
	
	public boolean ValidatePim() 
	{
		 Pimlink.click();
		 return Pimlink.isDisplayed();
	}
	
	public boolean Validateleave()
	{
		return Leavelink.isDisplayed();
	}
	
	public boolean ValidateRecruitment()
	{
		return Recruitmentlink.isDisplayed();
	}
	
	public boolean ValidatePerformances()
	{
		return Performanceslink.isDisplayed();
	}
	
	public boolean ValidateDirectory()
	{
		return Directorylink.isDisplayed();
	}
	
	public boolean ValidateMaintenance() 
	{
		return Maintenancelink.isDisplayed();
	}
	
	public boolean ValidateWelcomeadmin() 
	{
		return Welcomeadminlink.isDisplayed();
	}
	
	public boolean ValidateMarketplace() {
	return	 Marketplacelink.isDisplayed();
	//return	 Marketplacelink.isEnabled();
	}
	public boolean ValidateText() 
	{
		return Headertext.isDisplayed();
	}
	
	public boolean ValidateAssignleave() 
	{
		return Applyleavelink.isDisplayed();
	}
	
	public boolean Validateleaveimage() 
	{
		return leavelistlink.isDisplayed();
	}
	
	public boolean ValidateTimesheetimage() 
	{
		return Timesheetlink.isDisplayed();
	}
}


