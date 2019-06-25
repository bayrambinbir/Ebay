$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/Ebay/features/signIn.feature");
formatter.feature({
  "name": "Ebay Sign In",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Ebay Sign in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signIn"
    }
  ]
});
formatter.step({
  "name": "I am on ebay website \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "I get the title of Ebay to make sure that I am in Ebay",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Sign In Button",
  "keyword": "Then "
});
formatter.step({
  "name": "I type \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Sign In Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Fener",
        "Sampiyon1907"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Ebay Sign in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signIn"
    }
  ]
});
formatter.step({
  "name": "I am on ebay website \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "SignInStepDefs.i_am_on_ebay_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the title of Ebay to make sure that I am in Ebay",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.i_get_the_title_of_Ebay_to_make_sure_that_I_am_in_Ebay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Sign In Button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefs.i_click_on_Sign_In_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"Fener\" and \"Sampiyon1907\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefs.i_type_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Sign In Button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefs.i_click_on_Sign_In_Button()"
});
formatter.result({
  "status": "passed"
});
});