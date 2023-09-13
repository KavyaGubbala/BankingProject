package com.BankingProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String url="https://demo.guru99.com/v3/index.php";
	public String username="mngr26593";
	public String password="1234567@";
	public static WebDriver driver;
	@BeforeClass
	public void SetUp() {
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver =new FirefoxDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
