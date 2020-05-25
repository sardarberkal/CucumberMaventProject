Feature: Login Action

Scenario: Successful Login with Valid Credentials

Given User is on Home page
When user navigate to LogIn page
And user enters username And password
Then Message displayed Login Successfully

Scenario: Successful LogOut
 When User LogOut from the Application
 Then Message displayed LogOut Successfully
