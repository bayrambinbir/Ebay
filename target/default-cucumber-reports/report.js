$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/Ebay/features/register.feature");
formatter.feature({
  "name": "Ebay Register",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Ebay New Account Registration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I go to \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "I get the title of Ebay to make sure that I am in Ebay",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Register Button",
  "keyword": "Then "
});
formatter.step({
  "name": "type \"\u003cname\u003e\" , \"\u003clastName\u003e\" , \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Create Account Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "lastName",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Fener",
        "Bahce1907",
        "fb19075@gmail.com",
        "Sampiyon1907"
      ]
    },
    {
      "cells": [
        "Fener1907",
        "Bahce",
        "fb19079@gmail.com",
        "SampiyonAziz"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Ebay New Account Registration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I go to \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.i_go_to(String)"
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
  "name": "I click on Register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.i_click_on_Register_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type \"Fener\" , \"Bahce1907\" , \"fb19075@gmail.com\" and \"Sampiyon1907\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.type_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create Account Button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.i_click_on_Create_Account_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Ebay New Account Registration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I go to \"https://www.ebay.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.i_go_to(String)"
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
  "name": "I click on Register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.i_click_on_Register_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type \"Fener1907\" , \"Bahce\" , \"fb19079@gmail.com\" and \"SampiyonAziz\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.type_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create Account Button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.i_click_on_Create_Account_Button()"
});
formatter.result({
  "status": "passed"
});
});