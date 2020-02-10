package com.frameworkpom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

    By update = By.xpath("//*[@id=\"address_delivery\"]/li[7]/a");
    By street = By.id("address1");
    By city = By.id("city");
    By state = By.id("id_state");
    By submit = By.id("submitAddress");


    public void updateChangeOfAddress(WebDriver driver, String streetname, String cityname, String statename ){

        driver.findElement(update).click();
        driver.findElement(street).sendKeys(streetname);
        driver.findElement(city).sendKeys(cityname);
        Select state1 = new Select(driver.findElement(state));
        state1.selectByVisibleText(statename);
        driver.findElement(submit).click();




    }




}
