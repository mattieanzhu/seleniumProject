package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.assertEquals;

public class ActionPageTest extends FunctionalTest {
	
	@Given("^user opens Actions page$")
    public void user_opens_actions_page() throws Throwable {
        driver.get("http://webdriveruniversity.com/Actions/index.html");
        ActionPage actionPage = new ActionPage(driver);
        actionPage.performActions();
        assertEquals(actionPage.isDragConfirmationHeader(), "Dropped!");
        assertEquals(actionPage.isDoubleClickConfirmationHeader(), "Double Click Me!");
        assertEquals(actionPage.isHoldConfirmationHeader(), "Dont release me!!!");
    }

    @When("^user clicks on DRAG ME TO MY TARGET button$")
    public void user_clicks_on_drag_me_to_my_target_button() throws Throwable {
        
    }

    @Then("^holds and relases Click and Hold! button$")
    public void holds_and_relases_click_and_hold_button() throws Throwable {
        
    }

    @And("^user drags button to target$")
    public void user_drags_button_to_target() throws Throwable {
        
    }

    @And("^user double clicks Double Click Me button$")
    public void user_double_clicks_double_click_me_button() throws Throwable {
        
    }

}
