
Feature: Applicaton Login

 
  Scenario: Homepage deafault login
    Given User is on landing page 
    When User login with emailid "asd" and password "1234" 
    Then Home Page is populated
    And Cards are displayed "true"
  

 @smoketest
  Scenario: Homepage deafault login
    Given User is on landing page 
    When User login with emailid "asdf" and password "12345" 
    Then Home Page is populated
    And Cards are displayed "false"
