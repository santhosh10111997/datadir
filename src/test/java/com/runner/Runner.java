package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",dryRun=false
//,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//		//,"html:target/cucumber.html",
//		,"json:target/cucumber.json",
//		"rerun:C:\\Users\\pavithra\\eclipse-workspace\\WorkOut\\src\\test\\resources\\FaildScenarios\\fail.txt"
//		})
)
public class Runner {
	

}

