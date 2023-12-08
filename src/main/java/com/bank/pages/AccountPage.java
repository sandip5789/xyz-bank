package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutLink = By.xpath("//button[normalize-space()='Logout']");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By depositLinkBottom = By.xpath("//button[@type='submit']");
    By withdrawlLink = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawlLinkBottom = By.xpath("//button[normalize-space()='Withdraw']");
    By transactionSuccessfulPath = By.xpath("//span[@class='error ng-binding']");


    public String verifyLogoutText (){
        return getTextFromElement(logoutLink);
    }
    public void clickOnLogout(){
        clickOnElement(logoutLink);
    }
    public void enterAmount(String amount){
        sendTextToElement(amountField,amount);
    }
    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }
    public void clickOnDeposit(){
        clickOnElement(depositLinkBottom);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawlLink);
    }
    public void clickOnWithdrawlAfter(){
        clickOnElement(withdrawlLinkBottom);
    }
    public String verifyTransactionSuccessText(){
        return getTextFromElement(transactionSuccessfulPath);
    }

}
