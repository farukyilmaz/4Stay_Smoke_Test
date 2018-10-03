package com.fourstay.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory implements DriverSource {
    public enum  DriverType {
        CHROME,
        FIREFOX,
        OPERA,
        EDGE,
        IE,
        PHANTOMJS
    }

    @Override
    public WebDriver newDriver() {
        WebDriver driver = null;
        String browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
        DriverType driverType = DriverType.valueOf(browserName);
        switch (driverType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            case PHANTOMJS:
                WebDriverManager.phantomjs().setup();
                driver = new OperaDriver();
                break;

        }
        return driver;

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}