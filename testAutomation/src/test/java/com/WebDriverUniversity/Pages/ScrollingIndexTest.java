package com.WebDriverUniversity.Pages;

import org.junit.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScrollingIndexTest extends FunctionalTest {
	@Test
	@Given("^user opens scrolling index page$")
    public void user_opens_scrolling_index_page() throws Throwable {
		driver.get("http://webdriveruniversity.com/Scrolling/index.html");
		ScrollingIndex scrollingIndex = new ScrollingIndex(driver);
		scrollingIndex.scrollPage();
		assertTrue(scrollingIndex.isInitialized());
		assertEquals("Well done for scrolling to me!", scrollingIndex.confirmationHeaderOne());
		assertEquals("1 Entries", scrollingIndex.confirmationHeaderTwo());
		assertEquals("1 Entries", scrollingIndex.confirmationHeaderThree());
		assertEquals("X: 577Y: 816", scrollingIndex.confirmationHeaderFour());
    }

    @When("^user scrolls to elements$")
    public void user_scrolls_to_elements() throws Throwable {
        
    }

    @Then("^user is shown verification that elements were scrolled to$")
    public void user_is_shown_verification_that_elements_were_scrolled_to() throws Throwable {
        
    }
}
