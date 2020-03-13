package com.WebDriverUniversity.Pages;
import com.WebDriverUniversity.Pages.ContactUs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ContactUsTest extends FunctionalTest {
   @Given("^user opens contact\\-us page$")
   public void user_opens_contactus_page() throws Throwable {
		driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		ContactUs contactUs = new ContactUs(driver);
		contactUs.enterContactUs("Anzhu", "Mattie", "anzhumattie35@gmail.com", "test");
		assertTrue(contactUs.isInitialized());
		assertEquals("Thank You for your Message!", contactUs.isConfirmationHeader());
    }

    @When("^user inputs valid data for \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (.+)$")
    public void user_inputs_valid_data_for_something_and_something_and_something_and_something(String firstname, String lastname, String emailaddress, String comments) throws Throwable {
    	
    }

    @Then("^user is redirected to verification page$")
    public void user_is_redirected_to_verification_page() throws Throwable {
       
    }

    @And("^user clicks Submit button$")
    public void user_clicks_submit_button() throws Throwable {
       
    }
}
