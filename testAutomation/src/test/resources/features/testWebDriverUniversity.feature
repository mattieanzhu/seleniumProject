@test
Feature: Testing of webdriveruniversity pages with valid data
Scenario Outline: open webdriveruniversity login-portal page and login with valid data
	Given user opens login-portal page
	When user inputs valid for "<username>" and "<password>"
	And user clicks Login button
	Then user is redirected to a verification page
	
	Examples:
		| username| password|
		| user| pass|

Scenario Outline: open webdriveruniversity contact-us page and submit with valid data
	Given user opens contact-us page
	When user inputs valid data for "<first_name>" and "<last_name>" and "<email_address>" and <"comments>"
	And user clicks Submit button
	Then user is redirected to verification page
	
	Examples:
		| first_name| last_name| email_address| comments|
		| Anzhu| Mattie| anzhumattie35@gmail.com| test|
	
Scenario: open webdriveruniversity click-buttons page and click button
	Given user opens click-buttons page
	When the user clicks button
	Then user is shown confirmation pop-up
	
Scenario Outline: open webdriveruniversity to-do-list page and submit with valid data
	Given user opens to-do-list page
	When user inputs valid data for "<add_new_todo>"
	And user deletes an action
	Then user is shown new to-do list
	
	Examples:
	| add_new_todo| 
	| test|
	
Scenario: open webdriveruniversity dropdown-checkboxes-radiobuttons page and select dropdown and checkbox
	Given user opens dropdown-checkboxes-radiobuttons page
	When user selects dropdown option from dropdown menu
	And user selections option from Checkboxes
	And user selections radio button from radio buttons
	Then user is shown results
	
Scenario: open webdriveruniversity ajax-loader page and click button after waiting for it to load
	Given user opens ajax-loader page
	When user waits for button to load
	And user clicks Click Me! button
	Then user is shown verification pop-up
	
Scenario: open webdriveruniversity Scrolling Index page and scroll to elements
	Given user opens scrolling index page
	When user scrolls to elements
	Then user is shown verification that elements were scrolled to

Scenario: open webdriveruniversity Pop-up-alerts page and click out of pop-up
	Given user opens Pop-up alerts page
	When user clicks Click Me! button
	Then user clicks Ok on popup
	
	
Scenario Outline: open webdriveruniversity Autocomplete-TextField page and select suggested option with valid data
	Given user opens Autocomplete-TextField page with valid data "<inputString>" and "<completeString>"
	When user inputs valid data for food item search
	And user selects correct textfield from suggested menu
	Then user clicks Submit button
	
	Examples:
	| inputString| completeString|
	| a| Apple|