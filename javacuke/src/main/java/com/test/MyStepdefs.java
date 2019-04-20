package com.test;
import cucumber.api.java.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @When("^corresponding text prints$")
    public void corresponding_text_prints() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        System.out.println("success");
        System.out.println("step1 is successful");
    }

    @Then("^cucumber installation is successful$")
    public void cucumber_installation_is_successful() throws Throwable {
        System.out.println("step2 is successful");
    }
}
