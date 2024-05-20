package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObjectModels.HomePageObjects;
import resources.BaseClass;

@Test

public class LoginTestCases extends BaseClass {
	
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		initilizeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver from BaseClass scope available
		driver.get("https://naveenautomationlabs.com/opencart/");
		HomePageObjects hpo = new HomePageObjects(driver);
		Thread.sleep(4000); 
		
		hpo.clickOnMyAccount().click();
		hpo.clickOnLogin().click();
	}

}
