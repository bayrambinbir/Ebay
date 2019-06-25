package com.Ebay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		
		
		
		// multiple tags ---> mvn test
		// -Dcucumber.options="--tags @shoppingWithoutInsuranceForNonRxLenses,@singleMemberLookup"
		// mvn test -Dcucumber.options="--tags @browsingWithInsurance, @aboutUs" **WORKDED

},

		tags = {"@signIn" }, 
		features = "src/test/resources/com/Ebay/features", 
		glue = "com/Ebay/step_definitions", 
		dryRun = false, 
		monochrome = true)
       public class CukesRunner1 {
}
