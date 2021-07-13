package com.kardmatch.base.homePageTest;

import com.kardmatch.base.Base;
import com.kardmatch.base.homePage.BestCreditCardPage;
import com.kardmatch.base.homePage.HomeKardmatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeKardmatchTest{
    private WebDriver driver;
    HomeKardmatch homeKardmatch;
    BestCreditCardPage bestCreditCardPage;


    @Before
    public  void setUpBrowser(){
        homeKardmatch = new HomeKardmatch(driver);
        driver = homeKardmatch.setupBrowser();
        homeKardmatch.goToUrl("https://www.kardmatch.com.mx/");
    }
    @Test
    public void test(){
        homeKardmatch.surfToTheCardOnLine();
    }
    @After
    public  void  turnDown(){
        //driver.quit();
    }
}
