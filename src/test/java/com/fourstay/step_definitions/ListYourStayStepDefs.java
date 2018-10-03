package com.fourstay.step_definitions;

import com.fourstay.pages.HomePage;
import com.fourstay.pages.ListYourStayPage;
import com.fourstay.pages.ResultsPage;
import com.fourstay.serenity_steps.HomePageSteps;
import com.fourstay.serenity_steps.SearchSteps;
import com.fourstay.serenity_steps.SignInSteps;
import com.ibm.icu.impl.UResource;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class ListYourStayStepDefs extends ListYourStayPage {



    @Steps
    SignInSteps signInSteps;
    SearchSteps searchSteps;
    HomePage home;
    ResultsPage resultsPage;
    ListYourStayPage listYourStayPage;
    StepDefs stepDefs;


    @Given("^the user logs in as a host$")
    public void the_user_logs_in_as_a_host() throws Exception {
        signInSteps.signIn();

    }


    @Given("^the user goes to the List Your Stay Page$")
    public void the_user_goes_to_the_List_Your_Stay_Page() throws Exception {
        signInSteps.click_ListYourStayLink();
    }


    @Then("^they should see various stay options:$")
    public void they_should_see_various_stay_options(DataTable dt) throws Exception {


        String []linkText = new String[listYourStayPage.getListYourStayOptions.size()];

        int i=0;

        for(WebElementFacade a: listYourStayPage.getListYourStayOptions)
        {
            linkText[i]=a.getText();

            System.out.println(linkText[i]);
            System.out.println("============");

            System.out.println(dt.cells(i).get(0) );

            String actual = "["+linkText[i]+"]" ;

            Assert.assertEquals(dt.cells(i).get(0).toString() ,actual);

            i++;
        }
    }
}
