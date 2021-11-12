# Author = Sonal Mittal
# date: 11-Nov
# App : Rediff
Feature: Rediff Login page

  Scenario Outline: Enter email and password on rediffPage
    Given I am on RediffPage
    When I enter EmailID '<id>' & Password '<pwd>'
    And click on Login

    # dataTables
    Examples: 
      | id                | pwd       |
      | sonal04@gmail.com | abc@123   |
      | admin@gmail.com   | admin@123 |
      | emp@gmail.com     | emp@123   |
