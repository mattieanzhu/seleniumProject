package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ClickButtonsThree extends PageObject {
	
	public ClickButtonsThree(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="button3")
	private WebElement buttonThree;
	
	public void clickButton() {
		buttonThree.click();
	}
	
	public boolean confirmationHeader() {
		if(ExpectedConditions.alertIsPresent()!=null) {
			return true;
		}
		return false;
	}
}