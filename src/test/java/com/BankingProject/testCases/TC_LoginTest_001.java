package com.BankingProject.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.BankingProject.pageObjects.LoginPageElements;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() {
		driver.get(url);
		LoginPageElements loginElements=new LoginPageElements(driver);
		loginElements.setUsername(username);
		loginElements.setPassword(password);
		loginElements.clicksubmit();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
