package com.pages;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAnAccount extends Base {

    @FindBy(id = "myDropdown")
    WebElement myDropdown;
    @FindBy(xpath = "//div[contains(text(),'An elevated tier')]/../following-sibling::div/citi-cta/button[contains(text(),'Get')]")
    WebElement GetStarted;

    public OpenAnAccount(){
        PageFactory.initElements(driver, this);
    }
    public CheckingSavingPage clickChakingAndSavingFromDropDown(){
        WebElement ddown = driver.findElement(By.id("myDropdown"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Checking & Savings");
        return new CheckingSavingPage();
    }

}
