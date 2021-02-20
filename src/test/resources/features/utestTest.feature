@stories
Feature: Utest
   As a User, I want to register in utest platform
  @scenario1
  Scenario Outline: Register in the utest platform
    Given than Daniel want register utest platform

    When he fill out the forms
    | strName | strLastName | strEmail                       | strPassword |
    |  Daniel  |  Garcia     | danielgarcia10211222@gmail.com| TGGADll96$  |
    Then  he finish the proccess
    Examples:
      | strName  | strLastName |
      |  Daniel  |  Garcia     |

