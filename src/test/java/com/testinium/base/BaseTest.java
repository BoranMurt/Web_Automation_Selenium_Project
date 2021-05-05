package com.testinium.base;

import com.testinium.Log4j;
import com.testinium.constans.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    static WebDriver webDriver=null;


    @BeforeAll
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.WEBLINK);
    }
    public static WebDriver getWebDriver() {

        return webDriver;
    }
    public static void setWebDriver(WebDriver webDriver) {

        BaseTest.webDriver = webDriver;
    }
    public void tearDown(){
        getWebDriver().quit();
    }
}
