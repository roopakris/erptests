package com.frameworkpom.pageobjects;

import com.frameworkpom.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WomenCategoryPage extends BaseClass {

    By select = new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By item = new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
    By dress =new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
    By summer = new By.ByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");


public void selectitem(WebDriver driver) throws InterruptedException {


    itemname=itemname.DRESSES;
    switch (itemname){
        case WOMEN:
            mousehoveringOnLinkText(driver, "WOMEN");
            driver.findElement(item).click();
            break;
        case DRESSES:
            mousehoveringOnLinkText(driver, "DRESSES");
            driver.findElement(summer).click();
            break;
        case T_SHIRT:
            mousehoveringOnLinkText(driver, "T-SHIRT");
            driver.findElement(summer).click();
    }


//    mousehoveringOnLinkText(driver, "WOMEN");
//    driver.findElement(item).click();
//
//    mousehoveringOnLinkText(driver, "DRESSES");
//    driver.findElement(dress).click();
//
//    mousehoveringOnLinkText(driver, "DRESSES");
//    driver.findElement(summer).click();


}



}
