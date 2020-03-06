package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class ToDoList extends PageObject {
	public ToDoList(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/ul/li[1]/span/i")
	private WebElement deleteRowOne;;
	
	@FindBy(xpath="//*[@id=\"container\"]/input")
	private WebElement addToDo;
	
	@FindBy(xpath="//*[@id=\"container\"]/ul/li[1]")
	private WebElement rowOne;
	
	@FindBy(xpath="//*[@id=\"container\"]/ul/li[2]")
	private WebElement rowTwo;
	
	@FindBy(xpath="//*[@id=\"container\"]/ul/li[3]")
	private WebElement rowThree;
	
	public void addToDoList(String addToDo) {
		this.addToDo.clear();
		this.addToDo.sendKeys(addToDo);
		this.addToDo.sendKeys(Keys.RETURN);
		deleteRowOne.click();
	}
	
	public boolean isInitialized() {
		return addToDo.isDisplayed();
	}
}


