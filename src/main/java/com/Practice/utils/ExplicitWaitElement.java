package com.Practice.utils;

import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElement {
	
	
	//To wait for some seconds explicitly
	
	

	public static void checkClikableExplicitly(WebDriver driver,
			WebElement locator, Duration timeout ) {
		
		
		new WebDriverWait (driver, timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
}
