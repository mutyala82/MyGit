package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInformation {
    WebDriver driver = new ChromeDriver();
    WebElement userName = driver.findElement(By.name("identifier"));
    WebElement password = driver.findElement(By.name("password"));
    WebElement nextUserName = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
    WebElement nextPassword = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
}
