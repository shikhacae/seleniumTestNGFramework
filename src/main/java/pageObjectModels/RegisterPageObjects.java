package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	public WebDriver driver;
	private	By Firstname = By.xpath("//input[@name='firstname']");
	private By LastName = By.xpath("//input[@name='lastname']"); 
 	private By EMail = By.xpath("//input[@name='email']"); 
 	private By Telephone = By.xpath("//input[@name='telephone']"); 
 	private By Password = By.xpath("//input[@name='password']"); 
 	private By PasswordConfirm = By.xpath("//input[@name='confirm']"); 
 	private By agree = By.xpath("//input[@name='agree']"); 
 	private By Continue = By.xpath("//input[@value='Continue']");
 	
 	
 	public RegisterPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
 		this.driver= driver;
	}



	public WebElement EnterFirstName() {
 		return driver.findElement(Firstname);
 		
 	}
 	
 	public WebElement EnterlastName() {
 		return driver.findElement(LastName);
 		
 	}
 	
 	public WebElement EnterEmail() {
 		return driver.findElement(EMail);
 	}
 	public WebElement EnterTelephone() {
 		return driver.findElement(Telephone);
 		
 	}
 	
 	public WebElement EnterPasswd() {
 		return driver.findElement(Password);
 		
 	}
 	
 	public WebElement EnterConfirmPassword() {
 		return driver.findElement(PasswordConfirm);
 		
 	}
 	
 	public WebElement clickOnagree() {
 		return driver.findElement(agree);
 		
 	}
 	
 	public WebElement clickOnContinue() {
 		return driver.findElement(Continue);
 		
 	}
	
}
