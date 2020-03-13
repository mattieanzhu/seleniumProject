package com.WebDriverUniversity.Pages;

import com.WebDriverUniversity.Pages.AutoCompleteTextField;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class AutoCompleteTextFieldTest extends FunctionalTest { 
	@Given("^user opens Autocomplete-TextField page with valid data \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_opens_autocompletetextfield_page_with_valid_data_something_and_something() throws Throwable {
        driver.get("http://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        AutoCompleteTextField autoCompleteTextField = new AutoCompleteTextField(driver);
        autoCompleteTextField.completeTextField("a", "Apple");
    }

    @When("^user inputs valid data for food item search$")
    public void user_inputs_valid_data_for_food_item_search() throws Throwable {
        
    }

    @Then("^user clicks Submit button$")
    public void user_clicks_submit_button() throws Throwable {
       
    }

    @And("^user selects correct textfield from suggested menu$")
    public void user_selects_correct_textfield_from_suggested_menu() throws Throwable {
       
    }


}
