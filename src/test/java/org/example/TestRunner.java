package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\stass\\IdeaProjects\\DeliverTo_CucumberTests\\src\\test\\resources\\features",
        glue = {"stepdefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
