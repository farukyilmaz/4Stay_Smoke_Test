package com.fourstay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ListYourStayPage extends PageObject {


    @FindBy(xpath = "//*[@id='first_name']")
    public WebElementFacade listYourStayFirstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElementFacade listYourStayLastName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElementFacade listYourStayEmail;

    @FindBy(xpath = "//*[@id='password']")
    public WebElementFacade listYourStayPassword;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElementFacade listYourStayPhone;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElementFacade AcceptBox;

    @FindBy(xpath = "//*[@value='Create account']")
    public WebElementFacade listYourStaySubmitButton;

    @FindBy(xpath = "//*[@id='login-here']")
    public WebElementFacade alredyHaveAccountLogin;

    @FindBy(xpath = "//*[@id='url']")
    public WebElementFacade PasteURLHereField;

    @FindBy(xpath = "//*[@id='host_email']")
    public WebElementFacade pasteURLEmailField;

    @FindBy(xpath = "//*[@id='import-submit']")
    public WebElementFacade pasteURLSubmitButton;

    @FindBy(xpath = "//*[@class='request-btn']")
    public WebElementFacade requestAStayButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElementFacade listYourStayLink;

    @FindBy(xpath = "//div[@class='container']")
    public List<WebElementFacade> getListYourStayOptions;



}