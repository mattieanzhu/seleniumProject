package com.WebDriverUniversity.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class ActionPage extends PageObject {
	
	public ActionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"draggable\"]/p/b")
	private WebElement dragMe;
	
	@FindBy(id="droppable")
	private WebElement dropHere;
	
	@FindBy(xpath="//*[@id=\"double-click\"]/h2")
	private WebElement doubleClick;
	
	@FindBy(id="click-box")
	private WebElement clickBox;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[1]/button")
	private WebElement hoverOne;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[2]/button")
	private WebElement hoverTwo;
	
	@FindBy(xpath="//*[@id=\"div-hover\"]/div[3]/button")
	private WebElement hoverThree;
	
	Actions actions = new Actions(driver);
	
	public void performActions() {
		actions.dragAndDrop(dragMe, dropHere).build().perform();
		actions.doubleClick(doubleClick).build().perform();
		actions.moveToElement(hoverOne).perform();
		actions.moveToElement(hoverTwo).perform();
		actions.moveToElement(hoverThree).perform();
		actions.moveToElement(clickBox).clickAndHold(clickBox).perform();
		actions.release(clickBox).perform();
	}
	
	public String isDragConfirmationHeader() {
		return dropHere.getText();
	}
	
	public String isDoubleClickConfirmationHeader() {
		return doubleClick.getText();
	}
	
	public String isHoldConfirmationHeader() {
		return clickBox.getText();
	}

}
