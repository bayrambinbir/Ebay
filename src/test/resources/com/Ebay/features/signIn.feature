Feature: Ebay Sign In

 @signIn
 Scenario Outline: Ebay Sign in
   When I am on ebay website "https://www.ebay.com/"
   Then I get the title of Ebay to make sure that I am in Ebay
   Then I click on Sign In Button
   Then I type "<userName>" and "<password>"
   Then I click on Sign In Button

   Examples:
     | userName  | password     |
     | Fener     | Sampiyon1907 |