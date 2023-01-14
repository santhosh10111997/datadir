package com.stepdefinition;



import io.cucumber.java.After;

import java.io.IOException;

import com.base.BaseClass;
import com.helper.FileReaderManager;

import io.cucumber.java.*;

public class Hooks  extends BaseClass{
	@Before
	public void BeforeScenario() throws IOException {
//		BrowserLaunch("chrome");
//		urlLaunch("https://adactinhotelapp.com/");
	String browser = FileReaderManager.getInstance().getBrowser();
		BrowserLaunch(browser);
//		String url = FileReaderManager.getInstance().getUrl();
//		urlLaunch(url);
//		maximize();
//		implicitlyWait(10);

	}
	
	@After
	public void AfterScenario() {
//		quit();

	}

}
