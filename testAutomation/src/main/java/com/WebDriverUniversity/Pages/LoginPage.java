package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="text")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public void loginPortal(String userName, String passWord) {
		this.userName.clear();
		this.userName.sendKeys("userName");
		this.passWord.clear();
		this.passWord.sendKeys("passWord");
		loginButton.click();
	}
	

}
