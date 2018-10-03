package com.fourstay.step_definitions;

import com.fourstay.pages.HomePage;
import com.fourstay.serenity_steps.HomePageSteps;
import com.fourstay.utilities.UIConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class StepDefs {

	@Steps
	HomePageSteps homePage;

	HomePage home;


	@Given("^the user is on the (\\d+)Stay home page$")
	public void the_user_is_on_the_Stay_home_page(int arg1) throws Exception {
		homePage.open();

	}

	@When("^the user clicks on the registration options$")
	public void the_user_clicks_on_the_registration_options() throws Exception {
		homePage.openSignUpMenu();
		homePage.openSignUpMenuMoreOptions();
	}

	@Then("^following registration options should be displayed:$")
	public void following_registration_options_should_be_displayed(List<String> options) throws Exception {
	System.out.println();
		for (String option : options) {
			if (option.equalsIgnoreCase(UIConstants.CONTINUE_WITH_FACEBOOK)) {
				 home.elementState(home.facebookSignUp).shouldBeVisible();
			} else if (option.equalsIgnoreCase(UIConstants.CONTINUE_WITH_GOOGLE)) {
				home.elementState(home.googleSignUp).shouldBeVisible();
			} else {
				home.elementState(home.emailSignUp).shouldBeVisible();
			}
		}

	}
}
