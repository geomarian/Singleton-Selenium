package UATLMS.UATLMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleSet {

	public static WebDriver driver = null;
//ra
	private SingleSet(){
		System.out.println("Singleton Created");
	}
	
	public static  WebDriver getDriver() {
		if (driver == null) {
			if (Constant.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\geomj\\eclipse-workspace\\UATLMS\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (Constant.browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\geomj\\eclipse-workspace\\UATLMS\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Constant.URL);
		}
		return driver;
	}

	public static void quit() {
		driver.quit();
	}
}
