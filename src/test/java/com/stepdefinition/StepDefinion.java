package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.helper.FileReaderManager;
import com.pages.Page1;

import io.cucumber.java.en.*;

public class StepDefinion extends BaseClass {

	public static Page1 p1;

@Given("user launch the url")
public void user_launch_the_url() throws IOException {
//	BrowserLaunch("chrome");
//	urlLaunch("https://adactinhotelapp.com/");
	String browser = FileReaderManager.getInstance().getBrowser();
	BrowserLaunch(browser);
	String url = FileReaderManager.getInstance().getUrl();
	urlLaunch(url);
	maximize();
	implicitlyWait(10);
	 p1=new Page1();
}

@When("user fill the username and password")
public void user_fill_the_username_and_password(io.cucumber.datatable.DataTable da) {
   
Map<String, String> mp = da.asMap(String.class,String.class);
//	List<Map<String, String>> list = da.asMaps();
//	Map<String, String> mp = list.get(2);
//	   String user = mp.get("username");
//	   System.out.println(user);
//	   String user1 = mp.get("password");
//	   System.out.println(user1);
	   String s = mp.get("username");
	   System.out.println(s);
       
	   String s1 = mp.get("password");
	   System.out.println(s1);
	   
	   
 WebElement f = driver.findElement(By.id("username"));
  f.sendKeys(mp.get("username"));
   WebElement f1 = driver.findElement(By.id("password"));
   f1.sendKeys(mp.get("password"));
   
   

//
//@When("user fill the username and password")
//public void user_fill_the_username_and_password(io.cucumber.datatable.DataTable data) {
//   Map<String, String> mp = data.asMap(String.class, String.class);
//   String user = mp.get("username");
//   sendKeys(p1.getUsername(), mp.get("username"));
//   sendKeys(p1.getPassword(), mp.get("password"));
   
//	
//    List<List<String>> list = data.asLists();
//   List<String> s = list.get(0);
//   System.out.println(s);
//   List<String> s1 = list.get(1);
//   System.out.println(s1);
//   
//   WebElement f = driver.findElement(By.id("username"));
//   f.sendKeys(list.get(2).get(0));
//   WebElement f1 = driver.findElement(By.id("password"));
//   f1.sendKeys(list.get(1).get(1));
   
    System.out.println("pass");
  
}

@Then("user click the login button")
public void user_click_the_login_button() {
	Click(p1.getLogin());
	
}

@Then("user throw the message{string}")
public void user_throw_the_message(String expected) {
	WebElement okay = driver.findElement(By.xpath("//b[contains(text(),'Invalid')] "));
	String text = okay.getText();
	
	System.out.println(text);
    quit();
	
}


}
