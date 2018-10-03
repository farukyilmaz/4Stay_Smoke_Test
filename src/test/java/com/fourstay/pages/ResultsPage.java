package com.fourstay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//h2[@class='ng-binding']")
    public List<WebElementFacade> resultsMainDescription;

    @FindBy(xpath = "//span[@class='dropdown-value price ng-binding']")
    public WebElementFacade priceRangeDropDown;

    @FindBy(xpath = "(//span[@class='irs-slider to type_last'])[1]")
    public WebElementFacade priceRangeRightButton;

    @FindBy(xpath = "(//button[.='Apply'])[3]")
    public WebElementFacade applyButton;

    @FindBy(css = ".price-value>span.ng-binding")
    public List<WebElementFacade> allPrices;

    @FindBy(css = "div.price-slide .irs-from")
    public WebElementFacade priceRangeFrom;

    @FindBy(css = "div.price-slide .irs-to")
    public WebElementFacade priceRangeTo;

    @FindBy(css = "div.distance-slide .irs-to")
    public WebElementFacade distanceTo;

    public WebElement getGetListingTitle(int index){
        return getDriver().findElement(By.xpath("(//h2[@class='ng-binding'])["+index+"]"));

    }

    public int getFrameSize(){
        return getDriver().findElements(net.serenitybdd.core.annotations.findby.By.tagName("iframe")).size();
    }

    public void switchFrame(){
        getDriver().switchTo().parentFrame();
    }

}
