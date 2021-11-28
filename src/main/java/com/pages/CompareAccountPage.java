package com.pages;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompareAccountPage extends Base {

    @FindBy(xpath="//th/p[contains(text(),'Basic')]/..//div/button")
    WebElement basicAccountLink;

    @FindBy(xpath = "//div/h3[contains(text(),'Basic')]")
    WebElement basicAccountText;


    public CompareAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickOpenAccountBasicBanking()
    {
        driver.findElement(By.xpath(("//th/p[contains(text(),'Basic')]/..//div/button"))).click();
        //basicAccountLink.click();
    }

    public String verifyBasicAccontText(String expectedText){
       //  Assert.assertEquals(driver.findElement(By.xpath("//div/h3[contains(text(),'Basic')]")).getText(), expectedText);
        return driver.findElement(By.xpath("//div/h3[contains(text(),'Basic')]")).getText();
    }

}
