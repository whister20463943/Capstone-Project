@TC04
Feature: Validate Menus On Application & Count Number Of Links


Scenario Outline: Validate Menus

Given I am on Login page
When I enter "<username>" and "<password>" 
Then I click login button
Then I count number of menu links available
And I click each link one by one
And I click on logout

Examples:
 |username | password |
 |ayush123456@gmail.com | 123456 |