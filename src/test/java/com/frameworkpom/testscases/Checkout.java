package com.frameworkpom.testscases;

import com.frameworkpom.BaseClass;
import com.frameworkpom.pageobjects.*;
import com.frameworkpom.pageobjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Checkout extends BaseClass {
    WomenCategoryPage item = new WomenCategoryPage();
    SumDressesPage summerDress = new SumDressesPage();
    OrderPage order = new OrderPage();
    com.frameworkpom.pageobjects.LoginPage sign = new LoginPage();
    AddressPage address = new AddressPage();
    ShippingPage ship = new ShippingPage();
    Paymentpage paymethod = new Paymentpage();


    @Test
    public void checkingout() throws InterruptedException {

        WebDriver driver =browserInitialize();
        //driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);
        System.out.println("<<<<<<<Hurray on page selection>>>>>>");
        item.selectitem(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        //<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>
        Thread.sleep(3000);
        System.out.println("<<<<<<Hurray on summer dresses>>>>>");
        summerDress.addtobasket(driver);
        Thread.sleep(3000);


        order.checkorderdetails(driver);

        sign.signIn(driver, "reop@gmail.com", "Wordpresslogin1");

        address.updateChangeOfAddress(driver, "70 street walk", "warna", "Texas");

        ship.Shippingmethod(driver);

        paymethod.modeofpayment(driver);



        System.out.println("updating master only");


    }

}
