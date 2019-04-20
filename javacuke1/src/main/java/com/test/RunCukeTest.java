package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
//@CucumberOptions(features ="src/main/resources/Features/FirstTest.feature/",glue="com.test")
@CucumberOptions(strict = false, features = "src/main/resources/Features/FirstTest.feature/", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" }, tags = { "~@ignore" })

public class RunCukeTest {
}
