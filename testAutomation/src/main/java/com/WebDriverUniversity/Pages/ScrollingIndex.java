package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingIndex extends PageObject {
	public ScrollingIndex(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="zone1")
	private WebElement scrollOne;
	
	@FindBy(id="zone2-entries")
	private WebElement scrollTwo;
	
	@FindBy(id="zone3-entries")
	private WebElement scrollThree;
	
	@FindBy(id="zone4")
	private WebElement scrollFour;
	
	public void scrollPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		scrollOne.click();
		scrollTwo.click();
		scrollThree.click();
		js.executeScript("arguments[0].scrollIntoView(true);", scrollFour);
		scrollFour.click();
	}
	
	public boolean isInitialized() {
		return scrollFour.isDisplayed();
	}
	
	public String confirmationHeaderOne() {
		return scrollOne.getText();
	}
	
	public String confirmationHeaderTwo() {
		return scrollTwo.getText();
	}
	
	public String confirmationHeaderThree() {
		return scrollThree.getText();
	}
	
	public String confirmationHeaderFour() {
		return scrollFour.getText();
	}

}
