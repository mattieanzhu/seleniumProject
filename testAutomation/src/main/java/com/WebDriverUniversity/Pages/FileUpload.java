package com.WebDriverUniversity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUpload extends PageObject {
	
	public FileUpload(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(id="myFile")
	private WebElement chooseFile;
	
	public void fileUpload() {
		chooseFile.sendKeys("/Users/nimattie/Desktop/test.rtf");
	}
}
