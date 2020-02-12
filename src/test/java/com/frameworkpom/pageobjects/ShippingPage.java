package com.frameworkpom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {


    By checkBox = By.id("cgv");

    By chebutton = By.xpath("//*[@id=\"form\"]/p/button");

    public void Shippingmethod(WebDriver driver){

        driver.findElement(checkBox).click();
        driver.findElement(chebutton).click();
        System.out.println("Shipping method has been seleceted from >>>>shipping page");



    }
}
