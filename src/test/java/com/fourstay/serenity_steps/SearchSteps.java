package com.fourstay.serenity_steps;

import com.fourstay.pages.HomePage;
import com.fourstay.pages.ListingPage;
import com.fourstay.pages.ResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.Logger;
import net.serenitybdd.core.annotations.ImplementedBy;


import java.util.Iterator;
import java.util.Set;



import static junit.framework.TestCase.assertTrue;

public class SearchSteps extends ScenarioSteps {

    public HomePage homePage;
    public ResultsPage resultsPage;
    public ListingPage listingPage;
    final static Logger logger = Logger.getLogger(SearchSteps.class);

    @Step
    public void searchAnAreaInListings(String area){
        getDriver().manage().window().maximize();
        homePage.switchFrame();
        homePage.mainSearchBox.sendKeys(area);
        homePage.getDropDownSearchAreas(1).click();
       // homePage.mainSearchButton.click();
    }
    @Step
    public void checkListingsAgainstInformation(){
        resultsPage.switchFrame();
        logger.info("getText from getListingTitle index 1: "+resultsPage.getGetListingTitle(4).getText());
        resultsPage.getGetListingTitle(4).click();
        Set set = getDriver().getWindowHandles();
        String handle = getDriver().getWindowHandle();
        Iterator it = set.iterator();
        while (it.hasNext()){
            String s = it.next().toString();
            if(!s.equals(handle)){
                getDriver().switchTo().window(s);
                break;
            }
        }
    }

    @Step
    public void verifyListing(){
        listingPage.listingTitle.shouldContainText("Apt Accomadation");//verify title
        listingPage.hostName.shouldContainText("Faruk");//verify host

        Assert.assertEquals(Integer.parseInt(listingPage.listingPrice.getText().replace("$","").trim()),999);//verify price
        //verify amenities
        Assert.assertEquals("Gym", listingPage.propertyAmenities.get(0).getText().trim());
        Assert.assertEquals("Swimming pool", listingPage.propertyAmenities.get(1).getText().trim());
        Assert.assertEquals("In unit washer", listingPage.propertyAmenities.get(2).getText().trim());
        Assert.assertEquals("In unit dryer", listingPage.propertyAmenities.get(3).getText().trim());
        //Assert.assertEquals("Balcony", listingPage.propertyAmenities.get(2).getText().trim());
        // Assert.assertEquals("Wifi", listingPage.propertyAmenities.get(3).getText().trim());
        //verify property rules
        // Assert.assertEquals("Dogs okay",listingPage.propertyRules.get(0).getText().trim());
        // Assert.assertEquals("No parties events",listingPage.propertyRules.get(1).getText().trim());

    }

    @Step
    public void changePrice() throws InterruptedException {
        resultsPage.switchFrame();
        Assert.assertTrue(resultsPage.getGetListingTitle(1).isDisplayed());
        resultsPage.priceRangeDropDown.click();
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(resultsPage.priceRangeRightButton);
        actions.moveByOffset(-105,0);
        actions.release();
        actions.perform();
        resultsPage.applyButton.click();
        Thread.sleep(3000);
        boolean listing = false;
        try {
            logger.info("check to see getListTitle index 1 is displayed");
            listing = (!resultsPage.getGetListingTitle(1).isDisplayed());
        }catch (NoSuchElementException e){
            listing = true;
        }
//        Assert.assertTrue(listing);

    }

    @Step
    public void verifyResultsInRange(){

        String []linkText = new String[resultsPage.allPrices.size()];
        int i=0;

        //Storing List elements text into String array
        for(WebElementFacade a: resultsPage.allPrices)
        {
            System.out.println("***********************");
            System.out.println(a);
            System.out.println("***********************");
            linkText[i]=a.getText();
            i++;
        }

//        Integer[] readyToSort = convertStringArrayToIntegerArray(linkText);
//        Arrays.sort(readyToSort);
//        Integer highestPrice = readyToSort[readyToSort.length-1];
//        Integer lowestPrice = readyToSort[readyToSort[0]];

        for (String b:linkText
        ) {

            if(Integer.parseInt(b)>1900 || Integer.parseInt(b)<500){
                Assert.assertTrue(false);
                break;

            }

        }
    }
    public static Integer[] convertStringArrayToIntegerArray(String[] a){

        int i=0;
        Integer[] abc = new Integer[a.length];

        for (String each:a
        ) {
            abc[i] = Integer.parseInt(each) ;
            i++;
        }


        return abc;
    }


}
