package com.Practice.Tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Practice.Pages.LoginPage;



public class LoginTest extends BaseTest{
	
	//public static LoginPage loginPage = new LoginPage(driver);
	
	// LoginPage loginPage;
	
	@Test(priority = 1)

	public void ValidLogin() throws InterruptedException {
		
		log.info("Test_Case 1 is executed for valid credentials");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Mahak");           //(String name)
		log.info("userName was entered");
		loginPage.enterPassword();
		log.info("password was entered");
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(10)); 
		loginPage.clickSubmit();
	//  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);           //Depreciated
		//driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(10));      //Which we need to use
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		log.info(driver.getTitle()+ "driver get the title");
		//Thread.sleep(5000);
		
		
		
		
		
		
	}
	
	  @Test	(priority = 2)
      public void InValidLogin() throws InterruptedException {
		  
			log.info("Test_Case 2 is executed for Invalid credentials");
		
 	     
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Mahak0000000");
		log.info("Invalid userName was entered");
		loginPage.enterPassword();
		log.info("Invalid password was entered");
		loginPage.clickSubmit();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		Assert.assertTrue(driver.getTitle().contains("Mercury"));
		log.info(driver.getTitle()+ " driver get the title");
		System.out.println (driver.getTitle() + " Get the title");
		
	//	Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		
		
		
		
	}
	

}
