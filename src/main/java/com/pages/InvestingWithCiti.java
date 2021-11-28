package com.pages;

import com.base.Base;
import org.openqa.selenium.By;

public class InvestingWithCiti extends Base {


    //div//h1[contains(text(),'Choose')]
    //citi-modal[@primarybuttontext='Continue']//button[contains(text(),'Continue')]

    public void clickContinueButton(){
        driver.findElement(By.xpath("//citi-modal[@primarybuttontext='Continue']//button[contains(text(),'Continue')]")).click();
    }

    public String getChooseInvestmentText()
    {
      return driver.findElement(By.xpath("//div//h1[contains(text(),'Choose')]")).getText();
     // return chooseInvestmentText;
    }
}
