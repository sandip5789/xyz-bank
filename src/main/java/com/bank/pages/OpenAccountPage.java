package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    // By selectFromOptionPath = By.id("userSelect");
    By customerPath = By.id("userSelect");
    By currencyPath = By.id("currency");
    By processButton = By.xpath("//button[normalize-space()='Process']");




    public void selectCustomerName(String customerName){
        clickOnElement(customerPath);
        selectByVisibleTextFromDropDown(customerPath,customerName);
    }
    public void selectCurrency(String currencyName){
        clickOnElement(currencyPath);
        selectByVisibleTextFromDropDown(currencyPath,currencyName);
    }
    public void clickOnProcess(){
        clickOnElement(processButton);
    }

}
