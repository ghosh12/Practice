package com.pages;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Base {

    @FindBy(id = "CheckingchildLink0")
    WebElement checkingAccountLink;

    @FindBy(id="navbankingmainAnchor1")
    WebElement bankingLink;
    @FindBy(id="navOpenAccmainAnchor7")
    WebElement openAnAccountLink;


    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }


   /* public void clickOpenAccountBasicBanking()
    {
        driver.findElement(By.xpath(("//th/p[contains(text(),'Basic')]/..//div/button"))).click();
    }
    */
   public void closePopupWindow(){
       driver.findElement(By.xpath("//citi-modal[@idstr='zipcode-modal']//button[@aria-label='Close modal']")).click();
   }
    public void clickBanking(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbankingmainAnchor1"))).perform();

     //   action.moveToElement(bankingLink).perform();

    }

    public CheckingAccount clickChecking(){
        // checkingAccountLink.click();
        driver.findElement(By.id("navbankingmainAnchor1")).click();
        return new CheckingAccount();
    }
    public OpenAnAccount clickOpenAnAccount(){
        driver.findElement(By.id("navOpenAccmainAnchor7")).click();
        return new OpenAnAccount();
    }

    public void clickInvesting(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("investingmainAnchor3"))).perform();

   }
   public InvestingWithCiti clickInvestingOverview(){
       driver.findElement(By.id("Investing OverviewchildLink0")).click();
       return new InvestingWithCiti();
   }
   public void clickLanding() {
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.id("navlendingmainAnchor2"))).perform();
   }

   public MorgageByHome clickBuyAhome(){
       driver.findElement(By.xpath("//a[contains(text(),'Buy')]")).click();
       return new MorgageByHome();
}

    public void setBankingLink(WebElement bankingLink) {
        this.bankingLink = bankingLink;
    }
    //a[text()='Investing']
    //li//a[text()='Investing Overview']


}
