package com.citiTest;

import com.base.Base;
import com.pages.HomePage;
import com.pages.MorgageByHome;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MorgageByHomeTest extends Base {

    @Test
    public void morgageTest() throws InterruptedException {
        HomePage homePage =new HomePage();
        homePage.clickLanding();
        Thread.sleep(5);
        MorgageByHome morgageByHome = homePage.clickBuyAhome();
        morgageByHome.clickGetStarted();
        String actualText = morgageByHome.saveTimeText();
        Assert.assertEquals(actualText,"Save time");
        System.out.println("Second Branch Test");
    }

}
