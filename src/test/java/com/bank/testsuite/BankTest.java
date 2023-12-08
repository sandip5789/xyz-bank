package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();


    // 1.bankManagerShouldAddCustomerSuccessfully
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        // click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        // enter FirstName
        addCustomerPage.enterFirstName("Harry");
        // enter LastName
        addCustomerPage.enterLastName("Potter");
        // enter PostCode
        addCustomerPage.enterPostCode("MK10 7LN");
        // click On "Add Customer" Button
        addCustomerPage.addCustomer();
        // popup display // This switch method will switch to alert
        switchToAlert();
        // verify message "Customer added successfully"
        String expectedMessage = "Customer added successfully";
        // String actualMessage = getTextFromAlert().substring(0,27); // count start from 1st and include space
        String actualMessage = getTextFromAlert().substring(0, expectedMessage.length()); // count start from 1st and include space
        Assert.assertEquals(actualMessage, expectedMessage, "Customer not added successfully");
        // click on "ok" button on popup.
        acceptAlert();

    }

    // 2. bankManagerShouldOpenAccountSuccessfully
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        // click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccount();
        // Search customer that created in first test
        openAccountPage.selectCustomerName("Harry Potter");
        // Select currency "Pound"
        openAccountPage.selectCurrency("Pound");
        // click on "process" button
        openAccountPage.clickOnProcess();
        // popup displayed
        switchToAlert();
        // verify message "Account created successfully"
        String expectedText = "Account created successfully";
        // String actualText = getTextFromAlert().substring(0,28);
        String actualText = getTextFromAlert().substring(0, expectedText.length());
        Assert.assertEquals(actualText, expectedText, "Account can not created successfully");
        // click on "ok" button on popup.
        acceptAlert();

    }

    // 3. customerShouldLoginAndLogoutSuccessfully.
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        // click on "Customer Login" Tab
        homePage.clockOnCustomerLoginLink();
        // search customer that you created.
        customerLoginPage.clickOnYourName();
        customerLoginPage.selectCustomerName("Harry Potter");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        // verify "Logout" Tab displayed.
        Thread.sleep(2000);
        String expectedText = "Logout";
        String actualText = accountPage.verifyLogoutText();
        Assert.assertEquals(actualText, expectedText, "Logout not available");
        // click on "Logout"
        accountPage.clickOnLogout();
        // verify "Your Name" text displayed.
        String expectedText1 = "Your Name :";
        String actualText1 = customerLoginPage.verifyYourNameText();
        Assert.assertEquals(actualText1, expectedText1, "Your name text is not displayed");
    }

    // 4. customerShouldDepositMoneySuccessfully
    @Test
    public void customerShouldDepositMoneySuccessfully() {
        // click on "Customer Login" Tab
        homePage.clockOnCustomerLoginLink();
        // search customer that you created.
        customerLoginPage.clickOnYourName();
        customerLoginPage.selectCustomerName("Harry Potter");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        // click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        // Enter amount 100
        accountPage.enterAmount("100");
        // click on "Deposit" Button
        accountPage.clickOnDeposit();
    }

    // 5. customerShouldWithdrawMoneySuccessfully
    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        // click on "Customer Login" Tab
        homePage.clockOnCustomerLoginLink();
        // search customer that you created.
        customerLoginPage.clickOnYourName();
        customerLoginPage.selectCustomerName("Harry Potter");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        // click on "Withdrawl" Tab
        accountPage.clickOnWithdrawl();
        // Enter amount 50
        accountPage.enterAmount("50");
        // click on "Withdraw" Button
        accountPage.clickOnWithdrawlAfter();
        // verify message "Transaction Successful"
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.verifyTransactionSuccessText();
        Assert.assertEquals(actualMessage, expectedMessage, "Transaction fail");

    }

}
