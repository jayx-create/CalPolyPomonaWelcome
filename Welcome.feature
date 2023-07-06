Feature: Student on Cal Poly Pomona portal can see "Welcome" when logged into portal



Background: The customer has logged in to Cal Poly Pomona portal to pay classes
Given "<user>" is logged into Cal Poly Pomona portal 
And  User is registered with "<Language>"

@screenSizeType: ["Desktop"] @executionType: ["Browser"] 
Scenario Outline: "<testcaseID>" Student can see "Welcome" text when logged into portal
When User is home page of Cal Poly Pomona portal
Then User can see "Welcome" text on top of portal

Examples:
| TestCaseId     | Login Profile Id | Language  | user |
| CPP_1          | 201              | English   | 
