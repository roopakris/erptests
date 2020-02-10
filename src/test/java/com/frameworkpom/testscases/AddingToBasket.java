package com.frameworkpom.testscases;

import com.frameworkpom.BaseClass;
import com.frameworkpom.pageobjects.SumDressesPage;
import com.frameworkpom.pageobjects.WomenCategoryPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddingToBasket extends BaseClass {
    WomenCategoryPage item = new WomenCategoryPage();
    SumDressesPage summerDress = new SumDressesPage();


    @Test
    public void addtobasket() throws Exception {
        WebDriver driver =browserInitialize();
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        Thread.sleep(2000);
        System.out.println("Hurray on page selection");
        item.selectitem(driver);
        //<<<<<<<<scrolling down>>>>>>>>>>>>>>>>>
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        //<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>
        Thread.sleep(3000);
        System.out.println("Hurray on summer dresses");
        summerDress.addtobasket(driver);

        takeSnapShotFullWindow(driver, "C:\\Roopa\\Automation\\LearningAutomation\\src\\test\\resources\\screenshots\\Womenpage"+getCurrentDateTimeStamp()+".png");


        tearDown(driver);

    }

}
