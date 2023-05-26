Feature: DataTable Grade Levels Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

   @10
   Scenario: Create A New Grade Level

    And Click on the element in DataTableElements
      | setup       |
      | parameters  |
      | gradeLevels |
      | addButton   |

    And User sending the keys in DataTableElements
      | nameInput  | txt13 |
      | shortName  | tx3   |
      | orderInput | 1     |

    And Click on the element in DataTableElements
      | saveButton |


  @10
   Scenario: Create the registered Grade Level

    And Click on the element in DataTableElements
      | setup       |
      | parameters  |
      | gradeLevels |
      | addButton   |

    And User sending the keys in DataTableElements
      | nameInput  | txt13 |
      | shortName  | tx3   |
      | orderInput | 1     |

    And Click on the element in DataTableElements
      | saveButton |


    Then Verify the Grade Level already exist

  @10
  Scenario: Updating registered Grade level info

    And Click on the element in DataTableElements
      | setup          |
      | parameters     |
      | gradeLevels    |
      | gradeleveledit |

    And User sending the keys in DataTableElements
      | nameInput  | txt13 |
      | shortName  | tx3   |
      | orderInput | 1     |

    And Click on the element in DataTableElements
      | saveButton |


    Then Verify updating Grade Level succesfully


  @10
   Scenario: Deleting the registered Grade level info

    And Click on the element in DataTableElements
      | setup       |
      | parameters  |
      | gradeLevels |

    And Click on the element in DataTableElements
      | gradeleveldelete |
      | deleteDialogBtn  |

    Then Verify deleting Grade Level succesfully




