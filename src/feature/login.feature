@Kidoodle-Web
Feature: Kidoodle Web Login testing
  Description: Kidoodle Web login automated regression test

  @Kidoodle-Web-001 @Kidoodle-Web @login @Regression @Web
  Scenario: Kidoodle-Web-001 Try login function
    Given Open Kidoodle login page
    Then User is on 'Kidoodle home' page
    And User clicks 'Sign In'
    And User inputs 'Email Address'
    And User inputs 'Password'
    And User clicks 'SIGN IN'
    Then User can see 'Who\'s watching?'
    And User clicks 'Avatar 1'
    Then User can see 'Page with logged in icon'
