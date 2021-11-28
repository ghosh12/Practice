package com.pages;

import com.base.Base;
import org.openqa.selenium.By;

public class MorgageByHome extends Base {

    public void clickGetStarted(){
        driver.findElement(By.xpath("//a[text()='Get Started']")).click();


    }

    public String saveTimeText(){
        return driver.findElement(By.xpath("//div/h3[contains(text(),'Save time')]")).getText();
    }
}
