$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/Ebay/features/ebayShoppingSamsung.feature");
formatter.feature({
  "name": "Ebay Shopping Samsung",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ebay Shopping Automation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@shoppingSamsung"
    }
  ]
});
formatter.step({
  "name": "user goes to \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefs.user_goes_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefs.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Samsung\"",
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
formatter.step({
  "name": "user buys the Brand New samsung",
  "keyword": "Then "
});
formatter.match({
  "location": "EbayShoppingSamsungStepDefs.user_buys_the_Brand_New_samsung()"
});
formatter.result({
  "status": "passed"
});
});