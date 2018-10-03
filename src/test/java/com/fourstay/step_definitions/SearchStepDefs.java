package com.fourstay.step_definitions;


import com.fourstay.pages.HomePage;
import com.fourstay.pages.ResultsPage;
import com.fourstay.serenity_steps.HomePageSteps;
import com.fourstay.serenity_steps.SearchSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;

public class SearchStepDefs {

    @Steps
    SearchSteps searchSteps;

    HomePage home;


    ResultsPage resultsPage;

    @When("^the user searches an  \"([^\"]*)\"$")
    public void the_user_searches_an(String area) throws Exception {
        searchSteps.searchAnAreaInListings(area);


    }

    @Then("^the guest should be able to search for listings$")
    public void the_guest_should_be_able_to_search_for_listings() throws Exception {
        searchSteps.checkListingsAgainstInformation();
        searchSteps.verifyListing();

    }

    @When("^the user changes the price range to \\$(\\d+) - \\$(\\d+)$")
    public void the_user_changes_the_price_range_to_$_$(int arg1, int arg2) throws Exception {
        searchSteps.changePrice();
    }

      @Then("^the user should not see any results over that price range$")
      public void the_user_should_not_see_any_results_over_that_price_range() throws Exception {
          searchSteps.verifyResultsInRange();

    }
}





