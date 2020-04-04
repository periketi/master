#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Title of Login
 
@tag1
Scenario: Test Valid Login Scenario
Given Open URL 
 When Enter Username Password
Then validate User
	And Login

 @tag2
Scenario Outline: Test InValid Login Scenario
Given Open URL
When Enter Username Password
Then validate User
And Throw Error

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
