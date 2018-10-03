package com.fourstay.step_definitions;

import com.fourstay.serenity_steps.SignUpSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CreateUserStepDefs {

    @Steps
    SignUpSteps signUp;

    @Then("^the user should be able to sign up with a valid email address$")
    public void the_user_should_be_able_to_sign_up_with_a_valid_email_address() {
        signUp.signsUpUsingEmail();
        signUp.fillsOutUserInformation();

    }
    @Then("^the user should be able to sign up with a valid facebook account$")
    public void the_user_should_be_able_to_sign_up_with_a_valid_facebook_account() {
        signUp.signUpUsingFacebook();
//        signUp.fillsOutUserInformation();
    }

    @Then("^the user should be able to sign up with a valid Google\\+ address$")
    public void the_user_should_be_able_to_sign_up_with_a_valid_Google_address() {
        signUp.signUpUsingGmail();
        signUp.fillsOutUserInformation();
    }
}
