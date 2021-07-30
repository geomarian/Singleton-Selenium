package UATLMS11.UAT;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPage {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp(){
		SingleTon instance = SingleTon.getInstance(); //it will return from insdriver and it is a reference of SingleTon class
		driver=instance.openBrowser(); //it will call method
		
	}
	
	@Test
	public void visitLoginPage(){
		driver.get("http://uatlms.seesales.in/#/");
		System.out.println(driver.getTitle());	
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
}
