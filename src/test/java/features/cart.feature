 @Reg
 Feature: signin validation

  @Reg
  Scenario: sign in feature valiadation
    And enter valide username "standard_user" and password "secret_sauce"
    When validate click functionality
    And click cart btn
