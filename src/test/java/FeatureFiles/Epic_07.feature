Feature: Locations Feature

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @7
  Scenario: Locations Functionality
    And Navigate to Locations Page
    And Click on the element
      | addButton |
    And Creat a Location
      | nameInput     | Hgfune |
      | shortName     | qe|
      | capacityInput | 196 |

    And Click on the element
      | toggleBar     |
      | saveButton    |

    And Verify location saved successfully

@7
    Scenario: Locations Edit Functionality
      And Navigate to Locations Page
      And Find and edit entered information
        |gradeEdit|

      And Update information
        | nameInput     | Hgayse |
        | shortName     | Ae|
        | capacityInput | 195 |

      And Click on the element
        | toggleBar     |
        | saveButton    |

      And Verify location is updated

@7
      Scenario: Locations Delete Functionality
        And Navigate to Locations Page
        And Find and delete entered information
          |gradeDelete|
          |deleteDialogBtn|

        And Verify location is deleted





