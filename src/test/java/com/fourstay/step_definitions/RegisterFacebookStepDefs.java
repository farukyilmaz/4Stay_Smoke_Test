package com.fourstay.step_definitions;

import com.fourstay.serenity_steps.RegisterFacebookSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterFacebookStepDefs {
    @Steps
    RegisterFacebookSteps facebookSteps;





    @Given("^test facebook user is available$")
    public void test_facebook_user_is_available() throws Exception {
        facebookSteps.getNameFromUINamesAPI();
        facebookSteps.checkIfNameIsAvailableFromFacebook();
    }

    @When("^a user registers using facebook$")
    public void a_host_registers_using_facebook() throws Exception {

    }

    @Then("^the host should be able to see listing options$")
    public void the_host_should_be_able_to_see_listing_options() throws Exception {

    }

    @When("^a user registers using googlePlus$")
    public void a_host_registers_using_googlePlus() throws Exception {

    }
}
