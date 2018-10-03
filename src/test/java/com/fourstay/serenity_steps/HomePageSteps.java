package com.fourstay.serenity_steps;

import com.fourstay.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;

public class HomePageSteps extends ScenarioSteps {

    public HomePage homePage;

    @Step
    public void open() {
        homePage.open();

    }

    @Step
    public void openSignUpMenu() {
       homePage.signUpLink.click();
    }

    @Step
    public void openSignUpMenuMoreOptions() {
        homePage.moreOptions.click();

        homePage.facebookSignUp.waitUntilVisible();
    }






}
