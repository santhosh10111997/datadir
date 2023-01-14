package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\pavithra\\eclipse-workspace\\WorkOut\\src\\test\\resources\\FaildScenarios\\fail.txt",glue="com.stepdefinition")
public class ReRunner {

}
