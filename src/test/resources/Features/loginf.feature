Feature: login into website

  Background: 
    Given user opens the url
    When user tries click on Sign in link
    Then user is navigated to sign in page

  @E2E
  Scenario: User is on sign in page
    When user verify the title of the sign in page

  @Smoke
  Scenario Outline: User provides email and fills registration form
    Given user provides "<Email>" and clicks on createbutton
    When user is on registration page
    Then user fills "<Title>" and "<CFirstName>" and "<CLastName>" and "<Password>" and "<Date>" and "<Month>" and "<Year>" and "<Company>" and "<Address>" and "<City>" and "<State>" and "<ZipCode>" and "<Country>" and "<Mobile>" and "<Alias>"
    And clicks on register button

    Examples: 
      | Email         | Title | CFirstName | CLastName | Password | Date | Month | Year | Company | Address  | City    | State | ZipCode | Country | Mobile | Alias |
      | Z19@gmail.com | Mr.   | Same       | Lambe     | 123456&  |   12 |     3 | 1937 | Bayer   | 4, Santa | Alabama |     1 |   35000 |       1 |  25147 | samba |
