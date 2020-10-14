package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import example.CommonConstant;

public class Initialize {
	static WebDriver driver = null;
	static WebDriverWait myWait;
	
	public static void initialize(String nameOfPage) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		myWait = new WebDriverWait(driver, CommonConstant.WAITING_TIME);
		driver.manage().timeouts().implicitlyWait(CommonConstant.WAITING_TIME, TimeUnit.SECONDS);
		driver.get(nameOfPage);
	}
	
	public static void quitDriver() {
		driver.quit();
	}
}
