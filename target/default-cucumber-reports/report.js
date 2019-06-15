$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/Ebay/features/home.feature");
formatter.feature({
  "name": "Ebay Home",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ebay Automation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@home"
    }
  ]
});
formatter.step({
  "name": "I user goes to \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefs.i_user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on serach button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefs.user_clicks_on_serach_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Iphone\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefs.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Search button to search the item",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefs.user_clicks_on_Search_button_to_search_the_item()"
});
formatter.result({
  "status": "passed"
});
});