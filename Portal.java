import io.cucumer.java.en.And;
import io.cucumer.java.en.Given;
import io.cucumer.java.en.Then;
import io.cucumer.java.en.When;

public class FirstSteps {
  
  
@When("User clicks on new student drop down page of Cal Poly Pomona portal")
  public void UserClicksOnNewStudentDropDownPageOfCalPolyPomonaPortal(){
    switch(deviceMode){
    case GlobalConstant.DESKTOP:
      switch(language){
      case GlobalConstant.ENGLISH:
        secureSessionHeader_CPP.navigationLinks.calPolyPomonaLink.click();
        secureSessionHeader_CPP.navigationLinks.calPolyPomonaLink.waitForVisible();

if(!secureSessionHeader_CPP.navigationLinks.calPolyPomonaLink.isPresent()){
  throw new CPPException.NO_ELIGIBLE_ACCOUNTS("Cal Poly Pomona menus not displayed."
      + " Please check with IT Department of problem continues."
                                              }   
       secureSessionHeader_CPP.navigationLinks.calPolyPomonaLink.click();
        navigationLinks.waitForPageToLoad();
        navigationLinks.headerCalPolyPomona.verifyText("Cal Poly New Student")
          }
  }
  }

    
 @Then("User can see "Welcome" text on top of portal")
     public void userCanSeeWelcomeTextOnTopOfPortal() throws Exception{
   switch(deviceMode){
   case GlobalConstant.DESKTOP:
      switch(language){
      case GlobalConstant.ENGLISH:
       newStudentPage.welcomeText.isDisplayed();
       newStudentPage.welcomeText.verifyText("Welcome");
       break;
     default:
       throw new CPPException.GENERAL_SCRIPT(String.format("Invalid device type. Please Validate, deviceMode));
   }
 }
}
}
       
  
