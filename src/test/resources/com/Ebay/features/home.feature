Feature: Ebay Home 
@home 
Scenario: Ebay Automation 
	When user goes to "https://www.ebay.com/" 
	Then user clicks on serach button 
	Then  user searches for "Iphone" 
	Then user clicks on Search button to search the item 
	Then user clicks on item <6> to purchase it if item is "New" and choose "Gold" as desired color 
    Then Hey