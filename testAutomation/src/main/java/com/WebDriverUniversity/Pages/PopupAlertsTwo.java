package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;


public class PopupAlertsTwo extends PageObject {
	public PopupAlertsTwo(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"button4\"]/p")
	private WebElement modalPopup;
	
	public void popupAlertsTwo() {
		modalPopup.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}