package com.WebDriverUniversity.Pages;

import com.WebDriverUniversity.Pages.AjaxLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.assertTrue;



public class AjaxLoaderTest extends FunctionalTest {
	@Given("^user opens ajax\\-loader page$")
	public void user_opens_ajaxloader_page() throws Throwable {
		driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");
		AjaxLoader ajaxLoader = new AjaxLoader(driver);
		ajaxLoader.waitAjaxLoader();
		assertTrue(ajaxLoader.isConfirmationHeader());
	}

	@When("^user waits for button to load$")
	public void user_waits_for_button_to_load() throws Throwable {
	        
	}

	@Then("^user is shown verification pop\\-up$")
	public void user_is_shown_verification_popup() throws Throwable {
	        
	}

	@And("^user clicks Click Me! button$")
	public void user_clicks_click_me_button() throws Throwable {
	       
	}
}

