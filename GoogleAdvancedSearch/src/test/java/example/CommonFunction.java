package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import example.Initialize;

public class CommonFunction extends Initialize {
	public static void typeText(String xpathElement, String value) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.clear();
		element.sendKeys(value);
	}

	public static void clickElement(String xpathElement) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.click();
	}
	
	public static void visibleElement(String xpathExpression) {
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
	
	public static String getTextFromElement(String xpathElement) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		return(element.getText());
	}
}
	