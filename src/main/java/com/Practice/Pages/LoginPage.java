package com.Practice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public static WebDriver driver;         // Globally initialized a driver

	//Page Factory Create a Constructor of Login Page
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	@FindBy (how = How.NAME, using = "userName")
	WebElement userName;
	
	
	@FindBy (how = How.NAME, using = "password")
	WebElement password;
	
	
	@FindBy (how = How.NAME, using = "submit")
	WebElement submit;
	
	
	
	public void enterUsername(String name) {
		
		
		userName.sendKeys(name);
		
	}
	
	
	public void enterPassword() {
		password.sendKeys("123456789");	
		
		
	}
	
	public void clickSubmit() {
		submit.click();
	
	}
	

}
