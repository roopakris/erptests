package com.frameworkpom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By emailId = By.id("email");
    By password = By.id("passwd");
    By submit = By.id("SubmitLogin");

    public void enterEmailId(WebDriver driver, String emailValue) {
        driver.findElement(emailId).sendKeys(emailValue);
    }

    public void enterPassword(WebDriver driver, String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickOnSubmitButton(WebDriver driver) {
        driver.findElement(submit).click();
    }


    public void signIn(WebDriver driver, String emai, String passwordvalue){
        driver.findElement(emailId).sendKeys(emai);
        driver.findElement(password).sendKeys(passwordvalue);
        driver.findElement(submit).click();

        //signIn method
    }

}
