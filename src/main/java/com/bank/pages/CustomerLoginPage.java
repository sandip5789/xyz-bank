package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By yourNameLink = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");



    public void clickOnYourName(){
        clickOnElement(yourNameLink);
    }
    public void selectCustomerName(String customerName){
        clickOnElement(yourNameLink);
        selectByVisibleTextFromDropDown(yourNameLink,customerName);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyYourNameText(){
        return getTextFromElement(yourNameText);
    }

}
