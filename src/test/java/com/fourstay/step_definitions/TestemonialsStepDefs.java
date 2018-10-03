package com.fourstay.step_definitions;

import com.fourstay.pages.HomePage;
import com.fourstay.serenity_steps.HomePageSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class TestemonialsStepDefs {


    @Steps
    HomePageSteps homePage;

    HomePage home;


    @When("^user scrolls down page the (.*) testimotials should be displayed$")
    public void user_scrolls_down_page_the_testimotials_should_be_displayed(String arg1) throws Exception {

    }

    @When("^user should be able to click next button to read one testimonial at the time$")
    public void user_should_be_able_to_click_next_button_to_read_one_testimonial_at_the_time() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should see testimonial information for \"([^\"]*)\"$")
    public void user_should_see_testimonial_information_for(String arg1, DataTable arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }
}
