Feature: Login Page

@Test001
Scenario: Validate the LMS Login Page
Given User is in the LMS Login Page 
When User enter the username "vino@gmail.com"
And User enter the password "pass123$"
And User click the Login Button
Then User get the title page
And page title should be "LMS"

