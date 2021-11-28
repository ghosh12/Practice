package com.citiTest;

import com.base.Base;
import com.pages.CheckingAccount;
import com.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends Base{
    CheckingAccount checkingAccount;
    HomePage homePage;

    public OpenAccountTest(){
        homePage = new HomePage();
       checkingAccount = new CheckingAccount();
    }
    @Test
    public void openAccountForBasicBankingTest() {

   /*     homePage.clickBanking();
        //clickChecking();
        checkingAccount.clickChecking();
        homePage.closePopupWindow();
        homePage.clickLearnMore();
        try {
        homePage.clickOpenAccountBasicBanking();

            String actualText = driver.findElement(By.xpath("//div/h3[contains(text(),'Basic')]")).getText();
            Assert.assertEquals(actualText, "Basic Banking Package");
        }
        catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Popup did mot appear");
        }
*/
    }

}
