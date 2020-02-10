package com.frameworkpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllElements extends BaseClass{
//    WebDriver driver;

    By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By emailId = By.id("email");
    By password = By.id("passwd");
    By submit = By.id("SubmitLogin");


    public void userlogin(WebDriver driver){

        driver.findElement(signIn).click();
        driver.findElement(emailId).sendKeys("reop@gmail.com");
        driver.findElement(password).sendKeys("Wordpresslogin1");
        driver.findElement(submit).click();




    }




}
