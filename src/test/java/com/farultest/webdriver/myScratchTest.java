package com.farultest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myScratchTest {

    @Test
    public void myScratchTest(){
        System.setProperty("webdriver.chrome.driver", "/Code/myAutomation/src/main/resources/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.twitter.com");

        Assert.assertTrue("Title should start with 'Twitter. It's what's happening.'",
                driver.getTitle().startsWith("Twitter. It's what's happening."));

        driver.close();
        driver.quit();
    }
}
