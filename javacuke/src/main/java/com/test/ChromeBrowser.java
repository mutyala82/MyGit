package com.test;

import com.sun.xml.internal.messaging.saaj.soap.FastInfosetDataContentHandler;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

public class ChromeBrowser {

    @Test
    public void launchChrome() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait waitElement = new WebDriverWait(driver, 60);
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        Properties p=new Properties();
//        p.load(new FileInputStream("com/test/Locators.properties"));
//        System.out.println("Value is  : "   +  p.getProperty("userName"));
        waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
        driver.findElement(By.name("identifier")).sendKeys("mutyala82@gmail.com");
        WebElement locatorValue = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
        waitElement.until(ExpectedConditions.elementToBeClickable(locatorValue));
        locatorValue.click();
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("Myson#143");
        WebElement locatorValue1 = driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"));
        waitElement.until(ExpectedConditions.elementToBeClickable(locatorValue1));
        locatorValue1.click();
//        driver.findElement(By.
// )
        //*[@id="gb"]/div[2]/div[3]/div/div[2]/div/a
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")));
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"gb_71\"]")));
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
        driver.close();
//        WebElement abcd=driver.findElement(By.xpath("//*[@id=':k6']/div/div[2]/span/a"));
//        waitElement.until(ExpectedConditions.elementToBeClickable(abcd));
//        boolean abcd1=abcd.isEnabled();
//        Assert.assertEquals(abcd1,true);

//        driver.findElement(By.xpath("//a[@href='https://accounts.google.com/SignOutOptions?']")).click();

//        driver.findElement(By.className("RveJvd snByac")).click();
//        driver.findElement(By.name("password")).sendKeys("Myson#143");
//        driver.findElement(By.id("u_0_w")).click();
//        File src = new File("c:\\Rajesh\\rajesh.xlsx");
//        FileInputStream fis = new FileInputStream(src);
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        XSSFSheet sheet1 = wb.getSheetAt(0);
//        String string1 = sheet1.getRow(5).getCell(0).getRawValue();
//        System.out.println(string1);
//        driver.get("https://www.facebook.com/");
//        driver.manage().window().maximize();
//        String actualTitle=driver.getTitle();
//        driver.findElement(By.id("email")).sendKeys("mutyala82@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("ghijkm");
//        driver.findElement(By.id("u_0_w")).click();
//        System.out.println(actualTitle);
//        String expectedTitle="Facebook - Log In or Sign Up";
//        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
//        wait(4000);
//        driver.findElement(By.id("logoutMenu")).click();
//        driver.findElement(By.className("_54nh")).click();
    }
}

