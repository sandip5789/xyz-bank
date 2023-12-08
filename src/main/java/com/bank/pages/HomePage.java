package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginLink = By.xpath("//button[normalize-space()='Bank Manager Login']");
    By customerLoginLink = By.xpath("//button[normalize-space()='Customer Login']");


    public void clickOnBankManagerLoginTab(){
        clickOnElement(bankManagerLoginLink);
    }
    public void clockOnCustomerLoginLink(){
        clickOnElement(customerLoginLink);
    }

}
