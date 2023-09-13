package com.BankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
	public static WebDriver localDriver;
	public LoginPageElements(WebDriver remoteDriver) {
		localDriver=remoteDriver;
		PageFactory.initElements(localDriver, this);
	}
	@FindBy(name="uid")
	public static WebElement userName;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(name="btnLogin")
	public static WebElement loginButton;
	
	public void setUsername(String uname) {
		userName.sendKeys(uname);
	}
	public void setPassword(String pswd) {
		password.sendKeys(pswd);
	}
	public void clicksubmit() {
		loginButton.click();
	}

}
