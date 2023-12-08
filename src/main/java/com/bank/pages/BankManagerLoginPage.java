package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerLink = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccountLink = By.xpath("//button[normalize-space()='Open Account']");
    By customersLink = By.xpath("//button[normalize-space()='Customers']");


    public void clickOnAddCustomer(){
        clickOnElement(addCustomerLink);
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccountLink);
    }
    public void clickOnCustomersLink(){
        clickOnElement(customersLink);
    }
}
