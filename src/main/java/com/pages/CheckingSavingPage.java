package com.pages;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckingSavingPage extends Base {

    public void clickGetStarted() {
        WebElement getStartedBtn = driver.findElement(By.xpath("//div[contains(text(),'An elevated tier')]/../following-sibling::div/citi-cta/button[contains(text(),'Get')]"));
        getStartedBtn.click();

  }
    public String getCallbackText(){
        WebElement callMeBack = driver.findElement(By.xpath("//citi-modal[not(contains(@aria-hidden,'true'))]//div//h2[contains(text(),'Let')]/../../../../following-sibling::div//button"));
        return callMeBack.getText();
    }


}
