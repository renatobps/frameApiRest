Feature: Test name feature

  @UserRegistration
  Scenario: Resgistrate user - Endpoint - user/create
    Given that i execute endpoint for create user with userName "Jhon Doe", user "JD" and password "a123"
    When When I get the request return
    And statusCode "201"
    Then the username should be "Jhon Doe"
