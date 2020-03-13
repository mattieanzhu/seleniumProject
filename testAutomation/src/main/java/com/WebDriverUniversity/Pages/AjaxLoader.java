package com.WebDriverUniversity.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AjaxLoader extends PageObject {
	
	public AjaxLoader(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"button1\"]/p")
	private WebElement clickMe;
	
	private WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public void waitAjaxLoader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button1\"]/p")));
		clickMe.click();
	}
	
	public boolean isConfirmationHeader() {
		if(ExpectedConditions.alertIsPresent() != null) {
			return true;
		}
		return false;
	}

}


