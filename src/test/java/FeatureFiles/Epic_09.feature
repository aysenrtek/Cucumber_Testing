   Feature: DataTable Bank Accounts Functionality

    Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

   @9
   Scenario: Create A New Bank Accounts

    And Click on the element in DataTableElements
      | setup        |
      | parameters   |
      | bankaccounts |
      | addButton    |

    And User sending the keys in DataTableElements
      | nameInput | techno13 |
      | iban      | tec13    |

    And Click on the element in DataTableElements
      | currency |

    And Click on the element in DataTableElements
      | currencytext |

    And User sending the keys in DataTableElements
      | integrationCode | te13 |

    And Click on the element in DataTableElements
      | saveButton |


    Then Verify creating a new bank account succesfully

   @9
   Scenario: Create the registered Bank Accounts

    And Click on the element in DataTableElements
      | setup        |
      | parameters   |
      | bankaccounts |
      | addButton    |

    And User sending the keys in DataTableElements
      | nameInput | techno13 |
      | iban      | tec13    |

    And Click on the element in DataTableElements
      | currency |

    And Click on the element in DataTableElements
      | currencytext |

    And User sending the keys in DataTableElements
      | integrationCode | te13 |

    And Click on the element in DataTableElements
      | saveButton |

    Then Verify the bank account already exist

   @9
   Scenario: Updating registered bank accounts info

    And Click on the element in DataTableElements
      | setup        |
      | parameters   |
      | bankaccounts |

    And User sending the keys in DataTableElements
      | searchInput | techno13 |

    And Click on the element in DataTableElements
      | searchButton |

    And Click on the element in DataTableElements
      | editbutton |

    And User sending the keys in DataTableElements
      | nameInput | techno13 |
      | iban      | tec13    |

    And Click on the element in DataTableElements
      | currency |

    And Click on the element in DataTableElements
      | currencytext |

    And User sending the keys in DataTableElements
      | integrationCode | te13 |

    And Click on the element in DataTableElements
      | saveButton |


    Then Verify updating bank account succesfully

   @9
   Scenario: Deleting registered bank accounts info

    And Click on the element in DataTableElements
      | setup        |
      | parameters   |
      | bankaccounts |

    And User sending the keys in DataTableElements
      | searchInput | techno13 |

    And Click on the element in DataTableElements
      | searchButton    |
      | deleteImageBtn  |
      | deleteDialogBtn |

    Then Verify deleting bank account succesfully




