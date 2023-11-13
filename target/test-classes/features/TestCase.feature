Feature: Trendyol

  Scenario: Check the Trendyol Page operations
    Given Go to www.trendyol.com
    Then Check that the main page is opened
    Then I click Giris Yap button
    And I type 'ozge@uysal.com' in 'email'
    And I type '123456' in 'password'
    And I click on Giris Yap button
    Then I should see 'E-mail or password is incorrect
    Then I search for a 'saat'
    And I select a random watch
    And I add to basket selected watch
    And I go to my Basket
    And I increase the number of watch in the basket to the two
    Then I delete the all items in the basket


