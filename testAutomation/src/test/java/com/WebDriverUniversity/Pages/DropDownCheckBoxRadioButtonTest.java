package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownCheckBoxRadioButtonTest extends FunctionalTest {
	@Given("^user opens Dropdown\\-Checkboxes\\-RadioButtons page$")
    public void user_opens_dropdowncheckboxesradiobuttons_page() throws Throwable {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        DropDownCheckBoxRadioButton dropDownCheckBoxRadioButton = new DropDownCheckBoxRadioButton(driver);
        dropDownCheckBoxRadioButton.clickCheckBox();
    }

    @When("^user opens Dropdown Menu$")
    public void user_opens_dropdown_menu() throws Throwable {
        
    }

    @Then("^user selects dropdown option$")
    public void user_selects_dropdown_option() throws Throwable {
        
    }
	
}
