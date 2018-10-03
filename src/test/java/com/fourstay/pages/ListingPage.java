package com.fourstay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListingPage extends PageObject {

    @FindBy(xpath = "//div[@class='heading-block content-block-cropped bg-white bottom-border']/h3")
    public WebElementFacade listingTitle;

    @FindBy(xpath = "(//div[@class='col-4']/span)[2]")
    public WebElementFacade listingPrice;

    @FindBy(xpath = "(//div[@class='icon text-center']/small)[1]")
    public WebElementFacade listingType;

    @FindBy(xpath = "(//div[@class='icon text-center']/small)[2]")
    public WebElementFacade listingUnit;

    @FindBy(xpath = "(//div[@class='icon text-center']/small)[3]")
    public WebElementFacade listingBath;

    @FindBy(xpath = "(//div[@class='icon text-center']/small)[4]")
    public WebElementFacade listingHousehold;

    @FindBy(xpath = "(//div[@class='icon text-center']/small)[5]")
    public WebElementFacade listingBeds;

    @FindBy(xpath = "(//div[@class='content-wrapper'])[1]")
    public WebElementFacade listingDescription;

    @FindBy(xpath = "(//div[@class='content-wrapper'])[3]/div/div/small")
    public List<WebElement> propertyAmenities;

    @FindBy(xpath = "//div[@class='property-rules-block content-block-cropped bg-white bottom-border']/div/div/div/small")
    public List<WebElement> propertyRules;

    @FindBy(id = "host-info")
    public WebElementFacade hostInfo;

    @FindBy(xpath="//div[@id='host-info']/div/following-sibling::div/a")
    public WebElementFacade hostName;

    @FindBy(xpath = "//span[@class='middle-label']/p")
    public WebElementFacade availabilityDate;

    @FindBy(xpath = "//span[@class='bottom-label']")
    public WebElementFacade minimumStay;





    public void switchFrame(){

        getDriver().switchTo().parentFrame();
    }

}
