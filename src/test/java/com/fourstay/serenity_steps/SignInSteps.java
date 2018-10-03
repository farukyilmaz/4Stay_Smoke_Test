package com.fourstay.serenity_steps;

import com.fourstay.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void signIn(){

       homePage.signIn.click();
       homePage.emailOrPhone.sendKeys("surkhay88@gmail.com");
       homePage.password.sendKeys("Agdam.008888");
       homePage.logIn.click();

    }

    @Step
    public void click_ListYourStayLink(){
        homePage.listYourStayLink.click();
    }




}
