package com.Practice.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Practice.Pages.RegisterPage;

import ExcelUtils.ExcelIO;

public class RegisterPageTest extends BaseTest{
	
	@Test
	public void Register() throws InterruptedException {
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.clickonregister();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("globalWait"))));	
		
		
//		registerPage.enterDetails(prop.getProperty("firstName1"), 
//				prop.getProperty("lastName"), prop.getProperty("phone"), prop.getProperty("email"),
//				prop.getProperty("address"),prop.getProperty("city"),prop.getProperty("state"),
//				prop.getProperty("postalCode"),prop.getProperty("country"),prop.getProperty("password"),prop.getProperty("ConfirmPassword"));
//	   registerPage.clickonSubmit();
//	   Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	 
	   // Read Data from excel 
		
		WebElement FirstName = driver.findElement(By.name("firstName"));
		WebElement LastName = driver.findElement(By.name("lastName"));
		WebElement Phone = driver.findElement(By.name("phone"));
		WebElement UserName = driver.findElement(By.name("userName"));
		WebElement Country = driver.findElement(By.name("country"));
		WebElement city = driver.findElement(By.name("lastName"));
			ExcelIO reader = new ExcelIO ("src\\main\\java\\ExcelUtils\\ValidLogin.xlsx");
		    String sheetName = "Sheet1";
		    
		// String data = reader.getCellData(sheetName, 0, 2);
		// System.out.println (data);
		
		 
		int rowCount= reader.getRowCount(sheetName);
		  
		 
		 for (int rowNum=2; rowNum<=rowCount; rowNum++) {
			// reader.getCellData(sheetName, "Fname", rowNum);
			 
			 
			 
			 // By reader.getCellData we read the sheet, column name , row name as well
			String first= reader.getCellData(sheetName, "Fname", rowNum);
			String last = reader.getCellData(sheetName, "Lname", rowNum);
			String fone = reader.getCellData(sheetName, "phone", rowNum);
			String mail = reader.getCellData(sheetName, "email", rowNum);
			String cont = reader.getCellData(sheetName, "country", rowNum);
			
				
				System.out.println (first + " " + last + " " + fone + " " + " " + mail + " " + cont);
				
				
				
				FirstName.sendKeys(first);
				LastName.sendKeys(last);
				Phone.sendKeys(fone);
				UserName.sendKeys(mail);
				Country.sendKeys(cont);
				
				
				
		 }
	}
			 
 
	 
	
	
	@Test
	public static void visiblity() throws InterruptedException {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.clickonregister();
		registerPage.Select_Country();
		
		int noofframes =driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frames on webpage" + noofframes);
		
		Thread.sleep(2000);
		boolean isDisplayed = driver.findElement(By.linkText("Home")).isDisplayed();
		if (isDisplayed) {
			System.out.println ("Button Is Displayed");
		}
		
		else {
			
			System.out.println ("Button Is Not Displayed");
		
		
	}
	}

}
