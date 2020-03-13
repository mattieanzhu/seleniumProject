package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class FileUploadTest extends FunctionalTest {
	@Given("^user opens File\\-Upload page$")
	public void user_opens_fileupload_page() throws Throwable {
		driver.get("http://webdriveruniversity.com/File-Upload/index.html");
	    FileUpload fileUpload = new FileUpload(driver);
	    fileUpload.fileUpload();
	}

	    @When("^user clicks Choose File button$")
	    public void user_clicks_choose_file_button() throws Throwable {
	        
	    }

	    @Then("^user clicks Submit button$")
	    public void user_clicks_submit_button() throws Throwable {
	        
	    }

	    @And("^user selects file to upload$")
	    public void user_selects_file_to_upload() throws Throwable {
	        
	    }
}
