package com.WebDriverUniversity.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class AutoCompleteTextField extends PageObject {
	public AutoCompleteTextField(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="myInput")
	private WebElement foodItem;
	
	@FindBy(id="submit-button")
	private WebElement submitButton;
	
	@FindBy(id="myInputautocomplete-list")
	private List <WebElement> optionsToSelect;
	
	public void completeTextField(String inputString, String completeString ) {
		this.foodItem.clear();
		this.foodItem.sendKeys(inputString);
		for(WebElement option : optionsToSelect) {
			if(option.getText().contentEquals(completeString)) {
				option.click();
				break;
			}
		}
		submitButton.click();
	}
	
	public boolean isInitialized() {
		return foodItem.isDisplayed();
	}
}


