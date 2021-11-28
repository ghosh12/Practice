package com.citiTest;

import com.base.Base;
import com.pages.HomePage;
import com.pages.InvestingWithCiti;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvestingWithCitiTest extends Base {

    @Test
    public void investingWithCitiTest(){
        HomePage homePage = new HomePage();
        homePage.clickInvesting();
        InvestingWithCiti investingWithCiti = homePage.clickInvestingOverview();
        investingWithCiti.clickContinueButton();
        String actualText = investingWithCiti.getChooseInvestmentText();
        Assert.assertEquals(actualText,"Choose how you invest");
    }
}
