package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class AccordionItemTest extends FunctionalTest {
	 
	 @Given("^user opens Accordion page$")
	    public void user_opens_accordion_page() throws Throwable {
	        driver.get("http://webdriveruniversity.com/Accordion/index.html");
	        AccordionItems accordionItems = new AccordionItems(driver);
	        accordionItems.clickAccordionItem();
	        assertEquals(accordionItems.isConfirmationHeader(), "LOADING COMPLETE.");
	    }

	    @When("^user selects Keep Clicking! button$")
	    public void user_selects_keep_clicking_button() throws Throwable {
	        
	    }

	    @Then("^user waits for LOADING COMPLETE\\. text to load$")
	    public void user_waits_for_loading_complete_text_to_load() throws Throwable {
	        
	    }
}
