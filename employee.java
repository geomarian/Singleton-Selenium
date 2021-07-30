package com.maps;

import java.util.HashMap;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class employee extends HashMaps {
	public  WebDriver driver;
	public  String credential;
	public  String[] Info;

	@BeforeMethod
	public void setUp() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\geomj\\eclipse-workspace\\UATLMS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://uatlms.seesales.in/");

	}

//@Test
//public class employee extends HashMaps {
	//	public void HashMap<String, String> getUserLogin() throws InterruptedException {

	//public void main(String[] args) throws InterruptedException {
	@Test
	public  employee() throws InterruptedException{
	credential = HashMaps.getUserLogin().get("employee");
		
		Info = credential.split("_");
		System.out.println("splitted");
		driver.findElement(By.id("login_email_input")).sendKeys(Info[0]);
		System.out.println("enail");
		driver.findElement(By.id("login_password_input")).sendKeys(Info[1]);
		System.out.println("password");
		driver.findElement(By.id("login_submit_btn")).click();
		System.out.println("login");
		Thread.sleep(6000);
	
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}

