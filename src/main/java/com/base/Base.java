package com.base;

import com.pages.CheckingAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver = null;

    public void Base(){
        CheckingAccount checking = new CheckingAccount();
    }

    @BeforeTest
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.citi.com/");
        //Thread.sleep(10);
    }
/*
    public void clickBanking(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbankingmainAnchor1"))).perform();

    }

    public void clickChecking(){
        driver.findElement(By.id(("CheckingchildLink0"))).click();
    }

    public void closePopupWindow(){
        driver.findElement(By.xpath("//citi-modal[@idstr='zipcode-modal']//button[@aria-label='Close modal']")).click();
    }

    public void clickLearnMore(){
        driver.findElement(By.xpath(("//a[contains(text(),'Learn')]"))).click();
    }

    public void clickOpenAccountBasicBanking()
    {
        driver.findElement(By.xpath(("//th/p[contains(text(),'Basic')]/..//div/button"))).click();
    }

     */
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}


