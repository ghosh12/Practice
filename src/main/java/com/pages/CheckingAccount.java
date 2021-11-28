package com.pages;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingAccount extends Base {

    @FindBy(xpath = "//citi-modal[@idstr='zipcode-modal']//button[@aria-label='Close modal']")
    WebElement closePopupBtn;

    @FindBy(xpath="//a[contains(text(),'Learn')]")
    WebElement learnMoreLink;

    public CheckingAccount(){
        PageFactory.initElements(driver,this);
    }

   /* public void clickChecking(){
        driver.findElement(By.id(("CheckingchildLink0"))).click();
    }*/

    public void closePopupWindow(){
          driver.findElement(By.xpath("//citi-modal[@idstr='zipcode-modal']//button[@aria-label='Close modal']")).click();
      //  closePopupBtn.click();
    }
    public CompareAccountPage clickLearnMore(){
        driver.findElement(By.xpath(("//a[contains(text(),'Learn')]"))).click();
        //learnMoreLink.click();
        return new CompareAccountPage();
    }


}
