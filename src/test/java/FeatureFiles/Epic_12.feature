Feature: Nationalities Functionality Add - Edit - Delete

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @12
  Scenario:Create Add Nationalities
    Given Navigate to Nationalities page
    When create add Nationalities
    Then Success message should be displayed

  @12
  Scenario:Create Add Nationalities Negatif
    Given Navigate to Nationalities page
    When create add Nationalities
    Then negative message should be displayed

  @12
  Scenario:Create Edit Nationalities
    Given Navigate to Nationalities page
    When create edit Nationalities
    Then Success message should be displayed

  @12
  Scenario:Create Delete Nationalities
    Given Navigate to Nationalities page
    When create delete Nationalities
    Then Success message should be displayed

