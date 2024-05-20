package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjectModels.HomePageObjects;
import pageObjectModels.RegisterPageObjects;
//import pageObjectModels.HomePageObjects;
import resources.BaseClass;

public class RegisterTestCases extends BaseClass{
	
	@Test
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException{
		
		initilizeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver from BaseClass scope available
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		HomePageObjects hpo = new HomePageObjects(driver);
		Thread.sleep(4000); 
		
		hpo.clickOnMyAccount().click();
		hpo.clickOnRegister().click();
		hpo.clickOnLogin().click();
		
		RegisterPageObjects rpo = new RegisterPageObjects(driver);
		
		rpo.EnterFirstName().sendKeys("shikha");
		rpo.EnterlastName().sendKeys("test");
		rpo.EnterEmail().sendKeys("verma@gmail.com");
		rpo.EnterTelephone().sendKeys("9235363090");
		rpo.EnterPasswd().sendKeys("test");
		rpo.EnterConfirmPassword().sendKeys("test");
		rpo.clickOnagree().click();
		rpo.clickOnContinue().click();
		
		
		
		
		
	}
	

}
