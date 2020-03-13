package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	Actions actions = new Actions(driver);
	
	public void scrollPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		actions.moveToElement(scrollOne).perform();
		actions.moveToElement(scrollTwo).perform();
		actions.moveToElement(scrollThree).perform();
		js.executeScript("arguments[0].scrollIntoView(true);", scrollFour);
		actions.moveToElement(scrollFour).perform();
	}
	
	public boolean isInitialized() {
		return scrollFour.isDisplayed();
	}
	
	public String isConfirmationHeaderOne() {
		return scrollOne.getText();
	}
	
	public String isConfirmationHeaderTwo() {
		return scrollTwo.getText();
	}
	
	public String isConfirmationHeaderThree() {
		return scrollThree.getText();
	}
	
	public String isConfirmationHeaderFour() {
		return scrollFour.getText();
	}

}
