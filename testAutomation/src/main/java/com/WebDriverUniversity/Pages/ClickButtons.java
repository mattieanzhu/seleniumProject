package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ClickButtons extends PageObject {
	
	public ClickButtons(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="button1")
	private WebElement buttonOne;
	
	public void clickButton() {
		buttonOne.click();
	}
	
	public boolean isConfirmationHeader() {
		if(ExpectedConditions.alertIsPresent()!=null) {
			return true;
		}
		return false;
	}
}
