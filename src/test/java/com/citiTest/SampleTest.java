package com.citiTest;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest  extends Base {
   // public static WebDriver driver = null;

    @Test
    public void test() throws InterruptedException {

        // Declare one base class and extend it in you test class
        // Base class contains setup and teardown methodes
        //driver.findElement(By.id("navbankingmainAnchor1")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbankingmainAnchor1"))).perform();
        driver.findElement(By.id(("CheckingchildLink0"))).click();
        String actualText = driver.findElement(By.xpath("//*[contains(text(),'Where')]")).getText();
        Assert.assertEquals(actualText, "Where Do You Live?");

        //driver.close();

        //th/p[contains(text(),'Basic')]/..//div/button
    }

}