
Feature: ebay Home page

@ebay
Scenario: title of the page
Given I am on ebayHomepage
When I get title of the page
Then I valiadate the page title
