Feature: Student on Cal Poly Pomona portal can see "Welcome" when logged into portal



Background: The customer has logged in to Cal Poly Pomona portal 
Given "<LoginProfileId>" is logged into Cal Poly Pomona portal 
And  User is registered with "<Language>"

@screenSizeType: ["Desktop"] @executionType: ["Browser"] 
Scenario Outline: "<testcaseID>" Student can see "Welcome" text when logged into portal
When User clicks on new student drop-down page of Cal Poly Pomona portal
Then User can see "Welcome" text on top of portal

Examples: @CPP_1 @CPP_2
| TestCaseId     | LoginProfileId | Language  | 
| CPP_1          | 201              | English | 
| CPP_2          | 202              | Spanish | 
