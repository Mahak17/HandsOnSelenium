package com.Practice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
public static WebDriver driver;   //Globally initialised
	
	
	
	public RegisterPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}
	
	// Locators
		
	// WebElement Register = driver.findElement(By.linkText("REGISTER"));
	 @FindBy(how = How.LINK_TEXT, using = "REGISTER")
	 public WebElement Register;
//     WebElement FirstName = driver.findElement(By.name("firstName"));
	 @FindBy (how = How.NAME, using = "firstName")
		WebElement FirstName;
		
		
		@FindBy (how = How.NAME, using = "lastName")
		WebElement LastName;
		
	 
//     WebElement LastName = driver.findElement(By.name("lastName"));
//	WebElement Phone= driver.findElement(By.name("phone"));
		@FindBy (how = How.NAME, using = "phone")
		WebElement Phone;
		
		
		@FindBy (how = How.NAME, using = "userName")
		WebElement UserName;
		
//	WebElement Email = driver.findElement(By.id("email"));
//	WebElement Address = driver.findElement(By.name("address1"));
		@FindBy (how = How.NAME, using = "address1")
		WebElement Address;
		
		
		@FindBy (how = How.NAME, using = "city")
		WebElement City;
		
//	WebElement City = driver.findElement(By.id("city"));
//	WebElement State = driver.findElement(By.id("state"));
		
		@FindBy (how = How.NAME, using = "state")
		WebElement State;
		
		
		@FindBy (how = How.NAME, using = "postalCode")
		WebElement PostalCode;
		
		
		@FindBy (how = How.NAME, using = "country")
		WebElement Country;
		
		
		@FindBy (how = How.NAME, using = "password")
		WebElement Password;
		
		
		@FindBy (how = How.NAME, using = "confirmPassword")
		WebElement confirmpassword;
		
		@FindBy (how = How.NAME, using = "submit")
		WebElement Submit ;
		
		
		
		
		
		
//	WebElement Code = driver.findElement(By.id("postalCode"));
//	WebElement countries = driver.findElement(By.name("country"));
//	//WebElement userName = driver.findElement(By.name("email"));
//	WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
//	WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
//	WebElement Submit = driver.findElement(By.name("submit"));
//	
	

	
	// Actions 
	
	public void clickonregister() {
		Register.click();
	}
		public void Select_Country() {
			
		Select cont = new Select(driver.findElement(By.name("country")));
		cont.selectByVisibleText("ARUBA");
		}
		
	
public void enterDetails(String firstName, String lastName, String phone, String userName, String address1,
	String city, String state, String postalCode, String country, String password, String ConfirmPassword) {
		
	FirstName.sendKeys(firstName);
	LastName.sendKeys(lastName);
	Phone.sendKeys(phone);
	UserName.sendKeys(userName);
	Address.sendKeys(address1);
	City.sendKeys(city);
	State.sendKeys(state);
	PostalCode.sendKeys(postalCode);
	Country.sendKeys(country);
	Password.sendKeys(password);
	confirmpassword.sendKeys(ConfirmPassword);
}
public void clickonSubmit() {
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	
	
	Submit.click();
}
	
	
	
//		
//		
//		
//		
//		
//}
		
	}

	



