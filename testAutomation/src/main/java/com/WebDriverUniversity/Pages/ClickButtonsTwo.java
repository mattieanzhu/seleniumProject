package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ClickButtonsTwo extends PageObject {
	
	public ClickButtonsTwo(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="button2")
	private WebElement buttonTwo;
	
	public void clickButton() {
		buttonTwo.click();
	}
	
	public boolean confirmationHeader() {
		if(ExpectedConditions.alertIsPresent()!=null) {
			return true;
		}
		return false;
	}
}