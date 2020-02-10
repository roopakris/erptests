package com.frameworkpom;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseClass {

    public enum itemname{ WOMEN, DRESSES,T_SHIRT };
    public  itemname itemname;

    public WebDriver browserInitialize() {
        System.out.println("Initialise the browser !");
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public ExtentReports initializeExtentReports(){
        ExtentReports extent = new ExtentReports(".\\src\\test\\resources\\extentreports\\test_report.html", true);
        return extent;
    }

    public void tearDown(WebDriver driver) {
        System.out.println("Quit the browser !");
        driver.quit();
    }


    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        Files.copy(SrcFile.toPath(), DestFile.toPath());
    }

    public void takeSnapShotFullWindow(WebDriver driver, String fileWithPath) {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File(fileWithPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCurrentDateTimeStamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("_ddMMMyyyy_HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
    }

   // <<<<<<<<<<<Mouse hoveering>>>>>>


    public void mousehoveringOnLinkText(WebDriver driver,String itemname ) throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.linkText(itemname));
        builder.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }



}
