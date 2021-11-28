package com.citiTest;

import com.base.Base;
import com.pages.CheckingAccount;
import com.pages.CheckingSavingPage;
import com.pages.HomePage;
import com.pages.OpenAnAccount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSavingAndCheckingAccountTest extends Base {
    HomePage homePage;
    OpenAnAccount openAnAccount;
    CheckingSavingPage checkingSavingPage;

    OpenSavingAndCheckingAccountTest(){
        homePage = new HomePage();
    }

    @Test
    public void test(){
        openAnAccount = homePage.clickOpenAnAccount();
        checkingSavingPage = openAnAccount.clickChakingAndSavingFromDropDown();
        checkingSavingPage.clickGetStarted();
        String actualText = checkingSavingPage.getCallbackText();
        Assert.assertEquals(actualText,"Yes, call me back");

    }












































   /* HomePage homePage;
    OpenAnAccount openAnAccount;
    CheckingSavingPage checkingSavingPage;

    OpenSavingAndCheckingAccountTest(){
        homePage = new HomePage();
    }

    @Test
    public void openSavingAndCheckingAccountTest(){
        openAnAccount = homePage.clickOpenAnAccount();
        homePage.closePopupWindow();
        checkingSavingPage = openAnAccount.clickChakingAndSavingFromDropDown();
        checkingSavingPage.clickGetStarted();
        String actualText = checkingSavingPage.getCallbackText();
        Assert.assertEquals(actualText,"Yes, call me back");
    }*/

    // Open the browser // base
    // Launch the application url //base
    // Click on Open Account //create home page object and call openAccount
    // Slect Checking And Saiving  Account from dropdown //
    // Asset the Call back text

}
