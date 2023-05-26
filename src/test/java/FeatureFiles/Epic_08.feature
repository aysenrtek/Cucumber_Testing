Feature: Departmennts Feature

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

@8
  Scenario: Departments Functionality
    And Navigate to Departments Page
    And Click on the element
      | addButton |
    And Creat a Departments
      | nameInput | AyseTest |
      | code      | 25      |

    And Click on the element
      | toggleBar  |
      | saveButton |

    And Verify department saved successfully

  @8
  Scenario: Departments Edit Functionality

    And Navigate to Departments Page
    And Find and edit entered information
      |gradeEdit2|

    And Update information
      | nameInput | AaurTest |
      | code      | 2989     |

    And Click on the element
      | toggleBar     |
      | saveButton    |

    And Verify department is updated

    @8
  Scenario: Departments Delete Functionality
    And Navigate to Departments Page
    And Find and delete entered information
      |gradeDelete2|
      |deleteDialogBtn|

    And Verify department is deleted
