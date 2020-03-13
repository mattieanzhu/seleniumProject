package com.WebDriverUniversity.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccordionItems extends PageObject {
	public AccordionItems(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="click-accordion")
	private WebElement clickAccordion;
	
	@FindBy(id="hidden-text")
	private WebElement hiddenText;
	
	private WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public void clickAccordionItem() {
		clickAccordion.click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hidden-text"), "LOADING COMPLETE."));
	}
	
	public String isConfirmationHeader() {
		return hiddenText.getText();
	}

}
