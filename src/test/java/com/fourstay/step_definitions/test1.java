
package com.fourstay.step_definitions;

import com.fourstay.pages.HomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 extends HomePage{

 @FindBy(xpath="(//h4[@class='mt-3 card-title'])[2]")
 public WebElementFacade test;


    @Test
    public static void main(String[] args){

        myFirstMethod();

    }

    public static void myFirstMethod() {
        System.setProperty("webdriver.chrome.driver", "/Users/fk/Documents/workspace/com.4Stay/src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fourstay-staging.herokuapp.com/");
        String av = ((ChromeDriver) driver).findElementByXPath("(//h4[@class='mt-3 card-title'])[3]").getText();
        System.out.println(av);
    }

}

