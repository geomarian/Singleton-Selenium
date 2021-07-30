package UATLMS11.UAT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTon {
	
	public static SingleTon insdriver = null;
	private WebDriver driver;
	
	private SingleTon(){
		System.out.println("inside private");
	}
	//This is Base class
	public WebDriver openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geomj\\eclipse-workspace\\UAT\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
	//static method that has a return type is called singleton class/lazy initialization starts
	
	public static SingleTon getInstance(){  //if it null then only it will create a object
		if(insdriver==null)
			insdriver = new SingleTon();		// create ne w object here
		
		return insdriver;  //call method from test-calss then it once insdriver is called then it will call openBrowser method because it is under class SingleTon
		
		
	}
	
	

}
