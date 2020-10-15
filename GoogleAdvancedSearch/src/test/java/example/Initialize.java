package example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import example.CommonConstant;

public class Initialize {
	static WebDriver driver = null;
	static WebDriverWait myWait;
	
	public static void initialize() {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("10.225.3.1:3128");
		proxy.setSslProxy("10.225.3.1:3128");//https proxy
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
		
	    	driver = new ChromeDriver(options);  
		driver.manage().window().maximize();
		
		myWait = new WebDriverWait(driver, CommonConstant.WAITING_TIME);
		driver.manage().timeouts().implicitlyWait(CommonConstant.WAITING_TIME, TimeUnit.SECONDS);
		CommonFunction.driver = driver;
	}
	
	public static void accessPage(String nameOfPage){
		driver.get(nameOfPage);
	}
	
	public static void quitDriver() {
		driver.quit();
	}
}
