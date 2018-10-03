package com.fourstay.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


@DefaultUrl("https://4stay.com/")
//@DefaultUrl("https://fourstay-staging.herokuapp.com/")
public class HomePage extends PageObject {

    @FindBy(css = "a[href='/sign-up']")
    public WebElementFacade signUpLink;

    @FindBy(xpath = "//a[contains(text(),'More options')]")
    public WebElementFacade moreOptions;

    @FindBy(css = "[class='btn facebook-btn w-100 m-0 mb-3']")
    public WebElementFacade facebookSignUp;

    @FindBy(css = "[class='btn google-btn w-100 m-0 mb-3']")
    public WebElementFacade googleSignUp;

    @FindBy(css = "[class='btn email-btn w-100 m-0 mb-3']")
    public WebElementFacade emailSignUp;

    @FindBy(xpath = "//div[@class='title p-b-60 text-center']")
    public WebElement whatTheySaid;

    @FindBy(linkText = "REQUEST A STAY")
    public WebElementFacade requestStayButton;

    @FindBy(css = "[class='btn search-btn']")
    public WebElementFacade mainSearchButton;

    @FindBy(xpath = "//div[@class='form-group']/input")
    public WebElementFacade mainSearchBox;

    @FindBy(xpath = "(//span[@class='rotate-header'])[1]")
    public WebElementFacade dynamicHeader1;

    @FindBy(xpath = "(//span[@class='rotate-header'])[2]")
    public WebElementFacade dynamicHeader2;

    @FindBy(xpath = "(//span[@class='rotate-header'])[1]/span")
    public List<WebElementFacade> dynamicHeaderContent1;

    @FindBy(xpath = "(//span[@class='rotate-header'])[2]/span")
    public List<WebElementFacade> getDynamicHeaderContent2;

    @FindBy(css="overlay")
    public List<WebElementFacade> overlays;

    @FindBy(linkText = "VIEW ALL CITIES")
    public WebElementFacade viewAllCitiesButton;

    @FindBy(linkText = "//p[.='As an Associate Director of Sponsored Programs, I never had to worry about housing for our students because of our relationship with 4stay!']")
    public WebElementFacade leezaSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 1']")
    public WebElementFacade leezaPic;

    @FindBy(linkText = "I came from Europe for an internship at Pennsylvania Hospital, it was very easy for me to find a furnished home on the platform.")
    public WebElementFacade rudolfSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 2']")
    public WebElementFacade rudolfPic;

    @FindBy(linkText = "My home was ready before I arrived. It was very close to all the touristic attractions and the price was good.")
    public WebElementFacade studentSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 3']")
    public WebElementFacade studentPic;

    @FindBy(linkText = "My home was literally walking distance to my campus. Everything was furnished and all utilities included.")
    public WebElementFacade zeineSaid;

    @FindBy(xpath = "//img[@alt='Testimonial 4']")
    public WebElementFacade zeinePic;

    @FindBy(xpath = "//div[@class='carousel-inner d-flex flex-row justify-content-between']//img")
    public List<WebElement> learnSomethingNewPicRotation;

    @FindBy(xpath = "//a[@href='/about-us']")
    public WebElementFacade aboutUsLink;

    @FindBy(xpath = "//a[@href='http://blog.4stay.com']")
    public WebElementFacade blogLink;

    @FindBy(xpath = "//a[@href='/about-us#press']")
    public WebElementFacade pressLink;

    @FindBy(xpath = "//a[@href='https://angel.co/4-stay/jobs']")
    public WebElementFacade careersLink;

    @FindBy(xpath = "//a[@href='/contact-us']")
    public WebElementFacade contactUsLink;

    @FindBy(xpath = "//a[@href='https://help.4stay.com/']")
    public WebElementFacade helpLink;

    @FindBy(xpath = "//a[@href='https://help.4stay.com/']")
    public WebElementFacade facebookLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/@4stay_co']")
    public WebElementFacade twitterLink;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/4stay.co/']")
    public WebElementFacade instagramLink;

    @FindBy(xpath = "//img[@src='https://static.intercomassets.com/avatars/1348078/square']")
    public WebElementFacade chatBox;

    @FindBy(xpath = "//div[contains(@class,'intercom-conversation-summary intercom-conversation-summary-0')]")
    public WebElementFacade conversation1;

    @FindBy(css= "[placeHolder='\"Write a reply…\"]")
    public WebElementFacade writeReplyBox;


    @FindBy(css = "[viewBox='0 0 29 18']")
    public WebElementFacade gifButton;

    @FindBy(css = "[viewBox='0 0 18 18']")
    public WebElementFacade smileyButton;

    @FindBy(css = "[viewBox='0 0 16 18']")
    public WebElementFacade attachButton;

    @FindBy(xpath = "//*[@class='intercom-conversation intercom-messenger-body-view-enter-done']//div[@class='intercom-gif-picker-gif']")
    public List<WebElement> gifsFromBlueBox;

    @FindBy(xpath = "(//div[@class='intercom-emoji-picker-group'])")
    public static List<WebElement> emojisGroups;

    @FindBy(linkText = "Rent medium to long-term furnished stays today!")
    public WebElementFacade banner;

    @FindBy(id = "first-name")
    public WebElementFacade firstNameField;

    @FindBy(id = "last-name")
    public WebElementFacade lastNameField;

    @FindBy(id = "email")
    public WebElementFacade emailField;

    @FindBy(id = "password")
    public WebElementFacade passwordField;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 ng-binding']")
    public WebElementFacade signUpButton;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 mb-3']")
    public WebElementFacade nextButtonDuringSignUp;

    @FindBy(id = "occupation")
    public WebElementFacade occupationField;

    @FindBy(name = "phone")
    public WebElementFacade phoneField;

    @FindBy(id="about_me")
    public WebElementFacade aboutMeField;

    @FindBy(id="dob")
    public WebElementFacade dobField;

    @FindBy(css = "[class='btn btn-primary w-100 m-0 ng-binding']")
    public WebElementFacade saveButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElementFacade googleSignUpEmailField;

    @FindBy(xpath = "//span[.='Next']")
    public WebElementFacade googleSignUpEmailNextButton;

    @FindBy(id="email")
    public WebElementFacade facebookSignUpEmailField;

    @FindBy(id="pass")
    public WebElementFacade facebookSignUpPasswordField;

    @FindBy(xpath="//input[@type='submit']")
    public WebElementFacade facebookSignSubmitButton;

    @FindBy(xpath="(//h4[@class='mt-3 card-title'])[2]")
    public WebElementFacade test;

    @FindBy(xpath="(//a[@class='nav-link'])[2]")
    public WebElementFacade signIn;

    @FindBy(xpath="(//input[@class='form-control'])[1]")
    public WebElementFacade emailOrPhone;

    @FindBy(xpath="(//input[@class='form-control'])[2]")
    public WebElementFacade password;

    @FindBy(xpath="(//a[@class='btn btn-primary'])")
    public WebElementFacade logIn;

    @FindBy(css = "[class='nav-link'][4]")
    public WebElementFacade listYourStayLink;

    @FindBy(xpath="(//a[@class='btn btn-become-a-host'])")
    public WebElementFacade becomeAHost;


    public int getFrameSize(){
        return getDriver().findElements(By.tagName("iframe")).size();
    }

    public void switchFrame(){

        getDriver().switchTo().defaultContent();
    }


    public WebElement getDropDownSearchAreas(int index){
        return getDriver().findElement(By.xpath("(//div[@class='pac-item ng-scope ng-isolate-scope'])["+index+"]"));
    }





//    public static int groupSize = emojisGroups.size();
//
//
//    public static  List<WebElement> getEmoji(int group, int emoji){
//        if(group>=groupSize){
//            throw new IndexOutOfBoundsException("Emoji Group parameter is too large");
//        }
//        int emojiSize = new HomePage().getDriver().findElements(By.xpath("((//div[@class='intercom-emoji-picker-group'])["+group+"]/span")).size();
//
//        if(emoji>=emojiSize){
//            throw new IndexOutOfBoundsException("Emoji parameter is too large");
//        }
//        return new HomePage().getDriver().findElements(By.xpath("((//div[@class='intercom-emoji-picker-group'])["+group+"]/span)["+emoji+"]"));
//    }




    public WebElementState elementState(WebElement element) {
        return withTimeoutOf(5, TimeUnit.SECONDS).waitFor(element);
    }

}