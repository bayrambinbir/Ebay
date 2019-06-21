Feature: Ebay Register

  @register
  Scenario Outline: Ebay New Account Registration
    When I go to "https://www.ebay.com/"
    Then I get the title of Ebay to make sure that I am in Ebay
    Then I click on Register Button
    Then type "<name>" , "<lastName>" , "<email>" and "<password>"
    Then I click on Create Account Button

    Examples: 
      | name      | lastName  | email             | password     |
      | Fener     | Bahce1907 | fb19075@gmail.com | Sampiyon1907 |
      | Fener1907 | Bahce     | fb19079@gmail.com | SampiyonAziz |
     
