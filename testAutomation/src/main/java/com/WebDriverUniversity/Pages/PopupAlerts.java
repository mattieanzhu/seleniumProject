package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;


public class PopupAlerts extends PageObject {
	public PopupAlerts(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"button1\"]/p")
	private WebElement javaScriptAlert;
	
	public void popupAlertsOne() {
		javaScriptAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
