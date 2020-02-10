package com.frameworkpom.pageobjects;

import com.frameworkpom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

public class SumDressesPage {
    public String colour;

    By view = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]");
    //By view = new By.ByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[2]");
    By quantity= By.id("quantity_wanted");
    By size = By.id("group_1");
    By color = By.id("color_8");
    By yellowcolr = By.id("color_16");
    By black =By.id("color_14");
    By basket = By.id("add_to_cart");
    By cart = By.className("buttons_bottom_block no-print");
    By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");


    //By cart = new By.ByXPath("//*[@id=\"add_to_cart\"]");


    public void addtobasket(WebDriver driver) throws InterruptedException {


        Thread.sleep(3000);
        driver.findElement(view).click();
        //driver.findElement(quantity).sendKeys("1");
        Thread.sleep(3000);


        WebElement fr = driver.findElement(By.className("fancybox-iframe"));
        driver.switchTo().frame(fr);



        selectQuantity(driver, "1");
        sizeslection(driver,"M");
        selectColour(driver, "White");

        //driver.findElement(color).click();

        Thread.sleep(200);
        driver.findElement(By.name("Submit")).click();
        System.out.println("<<<<<<<<<your item is added to the basket/cart>>>>>>>");



        Thread.sleep(4000);
        System.out.println(driver.findElement(By.id("layer_cart")).getText());
        checkoutButton(driver);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Order - My Store" );
        //WebElement fe = driver.findElement(By.id("order"));
        driver.switchTo().parentFrame();
                //        String text = driver.getTitle();
//        System.out.println(text);
        //driver.findElement(basket).click();

    }

    //<<<<<<<<<<<< RE Usable Methods below  >>>>>>>>


    public void sizeslection(WebDriver driver, String whichsize){

        Select size1 = new Select(driver.findElement(size));
        size1.selectByVisibleText(whichsize);
    }



    public void selectQuantity(WebDriver driver, String qty){

        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys(qty);
    }

    public void selectColour(WebDriver driver, String colour){
        switch (colour){
            case "White":

            driver.findElement(color).click();
            break;

            case "Yellow":
                driver.findElement(yellowcolr).click();

             break;

            case "Black":
                driver.findElement(black).click();
        }


    }


    public void checkoutButton(WebDriver driver){

        driver.findElement(checkout).click();


    }

}
