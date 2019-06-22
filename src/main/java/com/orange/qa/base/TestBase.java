package com.orange.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orange.qa.util.Testutil;

public class TestBase {
	public static WebDriver driver;
	public static  Properties prop;
	
	public TestBase(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("G:\\A Complete selenium webdriver\\venkatesh\\venkatesh\\seleniumscripts\\new\\FreeHRMTest\\src\\main\\java\\com"
					+ "\\orange\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\A Complete selenium webdriver"
					+ "\\selenium_lib\\hi\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else 
		{
			System.out.println("browser not found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
