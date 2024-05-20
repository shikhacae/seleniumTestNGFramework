package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
public WebDriver driver; // null driver, dont have any scope bcz no any value
private	By myAccount =By.xpath("//i[@class='fa fa-user']"); 
private	By register = By.xpath("//a[text()='Register']");
private By login= By.xpath("//a[text()='Login']"); 

public HomePageObjects(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement clickOnMyAccount() {
	return driver.findElement(myAccount);
	
}

public WebElement clickOnRegister() {
	return driver.findElement(register);
	
}
public WebElement clickOnLogin() { 
	 
		return driver.findElement(login); 
	} 

}

