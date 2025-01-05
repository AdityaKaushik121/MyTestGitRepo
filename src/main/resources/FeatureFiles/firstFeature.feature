Feature: Searching in Google page
@goog
Scenario: While i search in google

Given Google home page is launched and displayed
When I enter Selenium in google search bar
And I click enter
Then I see result open