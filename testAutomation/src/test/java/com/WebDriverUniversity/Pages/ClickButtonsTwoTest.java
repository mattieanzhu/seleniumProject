package com.WebDriverUniversity.Pages;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickButtonsTwoTest extends FunctionalTest {
	@Given("^user opens click\\-buttons page$")
	    public void user_opens_clickbuttons_page() throws Throwable {
		    driver.get("http://webdriveruniversity.com/Click-Buttons/index.html");
			ClickButtonsTwo clickButtonsTwo = new ClickButtonsTwo(driver);
			clickButtonsTwo.clickButton();
			assertTrue(clickButtonsTwo.isConfirmationHeader());
	    }

	    @When("^the user clicks button$")
	    public void the_user_clicks_button() throws Throwable {
	        
	    }

	    @Then("^user is shown confirmation pop\\-up$")
	    public void user_is_shown_confirmation_popup() throws Throwable {
	        
	    }

}