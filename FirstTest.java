package UATLMS.UATLMS;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTest {

	@BeforeClass
	public void allSet(){
			SingleSet.getDriver();
	}

	@Test
	public void seeLoginPage(){
		String title = SingleSet.driver.getTitle();
		System.out.println("Entered to" + title);
		Assert.assertEquals(title, Constant.Title);
	}
	
	
	
	
	@AfterClass
	public void allQuit(){
		SingleSet.quit();
	}
}
