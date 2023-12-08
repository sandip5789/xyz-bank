package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By searchCustomerLink = By.xpath("//input[@placeholder='Search Customer']");

    public void clickOnSearchCustomer(){
        clickOnElement(searchCustomerLink);
    }

}
