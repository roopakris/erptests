package com.frameworkpom.testscases;

import com.frameworkpom.BaseClass;
import com.frameworkpom.pageobjects.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

    HomePage homePage = new HomePage();
    com.frameworkpom.pageobjects.LoginPage loginPage = new com.frameworkpom.pageobjects.LoginPage();

    @Test
    public void successfulLogin() throws Exception {
//        AllElements lgoin = new AllElements();
        ExtentReports extentReport = initializeExtentReports();
        ExtentTest extentReport_Login_Test = extentReport.startTest("Homepage Test", "From Homepage check signin button");
       // ExtentTest extentReport_LoginPage_Test = extentReport.startTest("Login Test", "To check if login works");

        System.out.println("Inside Successful Login method");
        WebDriver driver = browserInitialize();
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        Thread.sleep(3000);
//        lgoin.userlogin(driver);
        extentReport_Login_Test.log(LogStatus.INFO, "Clicked on SignIn button");
        homePage.clickOnSignIn(driver);
        extentReport_Login_Test.log(LogStatus.PASS, "Pass");

        extentReport_Login_Test.log(LogStatus.INFO, "Enter Email id");
        loginPage.enterEmailId(driver, "reop@gmail.com");
        extentReport_Login_Test.log(LogStatus.PASS, "Pass");

        extentReport_Login_Test.log(LogStatus.INFO, "Enter Password");
        loginPage.enterPassword(driver, "Wordpresslogin1");
        extentReport_Login_Test.log(LogStatus.PASS, "Pass");

        extentReport_Login_Test.log(LogStatus.INFO, "Click on Submit button");
        loginPage.clickOnSubmitButton(driver);
        extentReport_Login_Test.log(LogStatus.PASS, "Pass");

        takeSnapShot(driver, ".\\src\\test\\resources\\screenshots\\loginpage"+getCurrentDateTimeStamp()+".png");
        takeSnapShotFullWindow(driver, ".\\src\\test\\resources\\screenshots\\loginpageFullPage"+getCurrentDateTimeStamp()+".png");
         //lgoin.userlogin(driver);

        extentReport_Login_Test.log(LogStatus.INFO, "Quitting browser");
        tearDown(driver);
        extentReport_Login_Test.log(LogStatus.PASS, "Pass");

        extentReport.endTest(extentReport_Login_Test);
        extentReport.flush();
    }


    public void orderitems(){


    }

}