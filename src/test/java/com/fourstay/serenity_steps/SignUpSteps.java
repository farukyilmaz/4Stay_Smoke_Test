package com.fourstay.serenity_steps;

import com.fourstay.pages.HomePage;
import com.fourstay.utilities.APIUtilities;
import com.fourstay.utilities.UIConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class SignUpSteps extends ScenarioSteps {
    HomePage home;
    private Map<String, String> map = APIUtilities.getRandomFirstAndLastNameAndPhoneNumber();
    private String fName = map.get("name");
    private String lName = map.get("surname");

    @Step
    public void signsUpUsingEmail() {
//        APIUtilities.deleteExistingEmailAddresses();
        String email = APIUtilities.getNewEmailAddress();
        home.emailSignUp.click();
        home.firstNameField.sendKeys(fName);
        home.lastNameField.sendKeys(lName);
        home.emailField.sendKeys(email);
        home.passwordField.sendKeys(UIConstants.PASSWORD);
        home.signUpButton.click();
        home.nextButtonDuringSignUp.click();
    }

    @Step
    public void signUpUsingGmail() {
        String[] g = APIUtilities.getGoogleEmailAndPassword(fName, lName);
        home.googleSignUp.click();
        home.googleSignUpEmailField.sendKeys(g[0]);
        home.googleSignUpEmailNextButton.click();
        home.googleSignUpEmailField.sendKeys(g[1]);
        home.googleSignUpEmailNextButton.click();
    }

    @Step
    public void signUpUsingFacebook() {
        home.facebookSignUp.click();
        String[] s = APIUtilities.getFacebookEmailAndPassword(fName, lName);
        System.out.println(s[0]);
        System.out.println(s[1]);
        home.facebookSignUpEmailField.sendKeys(s[0]);
        home.facebookSignUpPasswordField.sendKeys(s[1]);
        home.facebookSignSubmitButton.click();
    }


    @Step
    public void fillsOutUserInformation() {
        // TODO
        String phone = APIUtilities.getNewPhoneNumber();
        home.phoneField.sendKeys("80000000000");
        home.aboutMeField.sendKeys("test");
        home.dobField.sendKeys("1978");
        home.saveButton.click();
    }

}
