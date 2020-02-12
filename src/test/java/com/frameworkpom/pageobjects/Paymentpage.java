package com.frameworkpom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Paymentpage {


    By payment = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    By modeOfpay = By.xpath("//*[@id=\"cart_navigation\"]/button");
    By ordermessage = By.id("order-confirmation");

    public void modeofpayment(WebDriver driver){
        driver.findElement(payment).click();
        driver.findElement(modeOfpay).click();
        System.out.println("confirmed my order>>>>Paymentpage");

        if(driver.findElement(ordermessage).getText().contains("Your order on My Store is complete.")){
        System.out.println("order is placed completely");

    }}


}
