package com.citiTest;

import com.base.Base;
import com.pages.CheckingAccount;
import com.pages.CompareAccountPage;
import com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelTest extends Base {

    HomePage homePage = new HomePage();
    CheckingAccount checkingAccount;
    CompareAccountPage compareAccountPage;
    @Test
    public void pageObjectModelTest(){
        homePage.clickBanking();
        checkingAccount = homePage.clickChecking();
        try {
            checkingAccount.closePopupWindow();
        }catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Popup did mot appear");
        }
        compareAccountPage = checkingAccount.clickLearnMore();
        try{
            compareAccountPage.clickOpenAccountBasicBanking();
            String actualText =  compareAccountPage.verifyBasicAccontText("Basic Banking Package");
            Assert.assertEquals(actualText, "Basic Banking Package");
        }catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Popup did mot appear");
        }
    }
}
