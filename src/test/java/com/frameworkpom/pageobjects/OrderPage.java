package com.frameworkpom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrderPage {

    By price = By.id("total_price_container");
    By proceed = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    String amount = "$32.50";

    //By unitprice = By.id("product_price_6_31_265135");


    public void checkorderdetails(WebDriver driver) throws InterruptedException {


       System.out.println("hi here is my shopping"+driver.findElement(By.id("cart_title")).getText());

       Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)");

        System.out.println("your total shipping order is "+ driver.findElement(price).getText());

//
        String total = driver.findElement(price).getText();

//
        if (amount.equals(total)) {

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
//            driver.findElement(proceed).click();
            System.out.println("Hurray i bought the item");
//}
   }
}}