package com.frameworkpom.pageobjects;

import com.frameworkpom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public void clickOnSignIn(WebDriver driver) {
        driver.findElement(signIn).click();
    }
}
