package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageObject {
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/textarea")
	private WebElement comments;
	
	@FindBy(xpath="//*[@id=\"form_buttons\"]/input[2]")
	private WebElement submit;
	
	@FindBy(tagName="h1")
	private WebElement receipt;
	
	public ContactUs(WebDriver driver) {
		super(driver);
	}
	
	public void enterContactUs(String firstName, String lastName, String email, String comments) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
		this.email.clear();
		this.email.sendKeys(email);
		this.comments.clear();
		this.comments.sendKeys(comments);
		submit.click();
	}
	
	public boolean isInitialized() {
		return receipt.isDisplayed();
	}
	
	public String confirmationHeader() {
		return receipt.getText();
	}

}
