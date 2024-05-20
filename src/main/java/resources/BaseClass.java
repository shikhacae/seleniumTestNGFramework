package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public void initilizeDriver() throws IOException {
		//read the properties
		FileInputStream fis = new FileInputStream("C:\\Users\\Shikha Verma\\eclipse-workspace\\SelTestNGFramework\\src\\main\\java\\resources\\data.properties");
		
		//Access the data from properties
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("Please choose proper browser");
		}
		
		
	}

}
