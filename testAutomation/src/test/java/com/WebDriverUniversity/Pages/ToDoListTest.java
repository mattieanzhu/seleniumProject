package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.assertTrue;


public class ToDoListTest extends FunctionalTest {
	@Given("^user opens to\\-do\\-list page$")
    public void user_opens_todolist_page() throws Throwable {
    	driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
		ToDoList toDoList = new ToDoList(driver);
		toDoList.addToDoList("Add Test");
		assertTrue(toDoList.isInitialized());
	}

    @When("^user inputs valid data for \"([^\"]*)\"$")
    public void user_inputs_valid_data_for_something(String addnewtodo, String strArg1) throws Throwable {
        
    }

    @Then("^user is shown new to\\-do list$")
    public void user_is_shown_new_todo_list() throws Throwable {
        
    }

    @And("^user deletes an action$")
    public void user_deletes_an_action() throws Throwable {
        
    }

}
